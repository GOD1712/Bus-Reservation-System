package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "booking_details")
public class Booking {
	@Id
	@Column(name = "bookingId")
	private int bookingId;
//	@Column(name = "scheduleId")
//	private int scheduleId;
//	@Column(name = "userId")
//	private int userId;
	@Column(name = "noOfSeats")
	private int noOfSeats;
	@Column(name = "fareAmount")
	private double fareAmount;
	@Column(name = "totalAmount")
	private double totalAmount;
	@Column(name = "dateOfBooking")
	private LocalDate dateOfBooking;
	@Column(name = "bookingStatus")
	private String bookingStatus;
	
	@Autowired
	@ManyToOne
	private User user;
	
	@Autowired
	@ManyToOne
	private Schedule schedule;
	
	public Booking() {}
	
	public Booking(int noOfSeats, double fareAmount, double totalAmount, LocalDate dateOfBooking,
			String bookingStatus, User user, Schedule schedule) {
		this.noOfSeats = noOfSeats;
		this.fareAmount = fareAmount;
		this.totalAmount = totalAmount;
		this.dateOfBooking = dateOfBooking;
		this.bookingStatus = bookingStatus;
		this.user = user;
		this.schedule = schedule;
	}

	public Booking(int bookingId, int noOfSeats, double fareAmount, double totalAmount, LocalDate dateOfBooking,
			String bookingStatus, User user, Schedule schedule) {
		this.bookingId = bookingId;
		this.noOfSeats = noOfSeats;
		this.fareAmount = fareAmount;
		this.totalAmount = totalAmount;
		this.dateOfBooking = dateOfBooking;
		this.bookingStatus = bookingStatus;
		this.user = user;
		this.schedule = schedule;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(double fareAmount) {
		this.fareAmount = fareAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", noOfSeats=" + noOfSeats + ", fareAmount=" + fareAmount
				+ ", totalAmount=" + totalAmount + ", dateOfBooking=" + dateOfBooking + ", bookingStatus="
				+ bookingStatus + ", user=" + user + ", schedule=" + schedule + "]";
	}
	
}
