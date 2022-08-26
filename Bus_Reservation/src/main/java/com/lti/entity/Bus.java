package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_details")
public class Bus {
	@Id
	@Column(name = "busId")
	private int busId;
	@Column(name = "busPlateNo")
	private String busPlateNo;
	@Column(name = "capacity")
	private int capacity;
	@Column(name = "busType")
	private String busType;
	
	public Bus() {}
	
	public Bus(String busPlateNo, int capacity, String busType) {
		this.busPlateNo = busPlateNo;
		this.capacity = capacity;
		this.busType = busType;
	}
	
	public Bus(int busId, String busPlateNo, int capacity, String busType) {
		super();
		this.busId = busId;
		this.busPlateNo = busPlateNo;
		this.capacity = capacity;
		this.busType = busType;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusPlateNo() {
		return busPlateNo;
	}

	public void setBusPlateNo(String busPlateNo) {
		this.busPlateNo = busPlateNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busPlateNo=" + busPlateNo + ", capacity=" + capacity + ", busType=" + busType
				+ "]";
	}
	
}