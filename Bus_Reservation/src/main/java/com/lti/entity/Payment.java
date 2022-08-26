package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "payment_details")
public class Payment {
	@Id
	@Column(name = "paymentId")
	private int paymentId;
//	@Column(name = "bookingId")
//	private int bookingId;
	@Column(name = "paymentDate")
	private LocalDate paymentDate;
	@Column(name = "paymentMethod")
	private String paymentMethod;
	@Column(name = "amountPaid")
	private double amountPaid;
	
	@Autowired
	@OneToOne
	private Booking booking;
	
	public Payment() {}
	
	public Payment(LocalDate paymentDate, String paymentMethod, double amountPaid, Booking booking) {
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.amountPaid = amountPaid;
		this.booking = booking;
	}

	

	public Payment(int paymentId, LocalDate paymentDate, String paymentMethod, double amountPaid, Booking booking) {
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.amountPaid = amountPaid;
		this.booking = booking;
	}



	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentMethod=" + paymentMethod
				+ ", amountPaid=" + amountPaid + ", booking=" + booking + "]";
	}
	
}
