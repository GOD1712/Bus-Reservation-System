package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BusDao;
import com.lti.entity.Bus;
import com.lti.exception.BusNotFoundException;

@Service("busService")
public class BusServiceImpl implements BusService{
	
	@Autowired
	private BusDao busDao;

	@Override
	public List<Bus> getAllBusDetails() {
		return busDao.findAll();
	}

	@Override
	public Bus findBusByBusPlateNumber(String busPlateNo) throws BusNotFoundException{
		Bus bus = busDao.findByBusPlateNo(busPlateNo);
			if(bus == null) {
				throw new BusNotFoundException("Bus with Plate Number " + busPlateNo + "");
			}
		return bus;
	}

	@Override
	public Bus addBus(Bus bus) {
		if(bus!=null) {
			return busDao.save(bus);			
		}
		return null;
	}

	@Override
	public Bus modifyBus(String busPlateNo, Bus bus) throws BusNotFoundException{
		if(bus!=null) {
			return busDao.save(bus);			
		}
		return null;
	}

	@Override
	public Bus deleteBus(String busPlateNo) throws BusNotFoundException{
		Bus bus = this.findBusByBusPlateNumber(busPlateNo);
		if(bus != null) {
			busDao.delete(bus);
			return bus;
		}
		return null;
	}
	
}
