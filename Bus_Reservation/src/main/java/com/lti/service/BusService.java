package com.lti.service;

import java.util.List;

import com.lti.entity.Bus;
import com.lti.exception.BusNotFoundException;

public interface BusService {
	List<Bus> getAllBusDetails();
	Bus findBusByBusPlateNumber(String busPlateNo) throws BusNotFoundException;
	Bus addBus(Bus bus);
	Bus modifyBus(String busPlateNo, Bus bus) throws BusNotFoundException;
	Bus deleteBus(String busPlateNo) throws BusNotFoundException;
}
