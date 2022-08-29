package com.lti.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ScheduleDao;
import com.lti.entity.Schedule;
import com.lti.exception.BusNotFoundException;
import com.lti.exception.RecordNotFoundException;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	ScheduleDao scheduledao;
	
	@Autowired 
	BookingService bookingservice;

	@Override
	public List<Schedule> viewAllScheduledBuses() {
		
		return scheduledao.findAll();
	}

	@Override
	public Schedule addScheduledBus(Schedule scheduledBus) {
		
		return scheduledao.save(scheduledBus);
	}

	@Override
	public Schedule modifyScheduledBus(Schedule scheduledBus) {
		// TODO Auto-generated method stub
		
		Schedule updateSchedule = scheduledao.findById(scheduledBus.getScheduleId()).get();
		
		updateSchedule.setStartingPoint(scheduledBus.getStartingPoint());
		updateSchedule.setDestination(scheduledBus.getDestination());
		updateSchedule.setEstimatedArrivalTime(scheduledBus.getEstimatedArrivalTime());
		updateSchedule.setDepartureTime(scheduledBus.getDepartureTime());
		scheduledao.save(updateSchedule);
		return scheduledBus;
	
	}

	@Override
	public String removeScheduledBus(int busid) throws RecordNotFoundException  {
		// TODO Auto-generated method stub
		Optional<Schedule> scheduleFlight = scheduledao.findById(busid);
		if (!scheduleFlight.isPresent())
			throw new RecordNotFoundException("Enter a valid Flight Id");
		else {
			scheduledao.deleteById(busid);
		}
		return "Scheduled flight with Id" + busid +"is not found";
	}

	@Override
	public Schedule viewScheduledBus(int busId) throws BusNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Schedule> scheduleBus = scheduledao.findById(busId);
		if (!scheduleBus.isPresent())
			throw new BusNotFoundException("Enter a valid Flight Id");
		else
			return scheduleBus.get();
		
	}
	
	@Override
	public List<Schedule> findBystartingPointAndDestinationAndScheduleDate(String startingPoint, String endingPoint, String scheduleDate){
		return this.scheduledao.findBystartingPointAndDestinationAndScheduleDate(startingPoint,endingPoint,scheduleDate);
	}

}
