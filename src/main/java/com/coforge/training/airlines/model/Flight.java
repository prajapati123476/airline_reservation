package com.coforge.training.airlines.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	private long id;
	private String source;
	private String destination;
	private long dtime;	// Departure Time
	private long atime;	// Arrival Time, date,
	private Date ddate;
	
	public Flight(long id, String source, String destination, long dtime, long atime, Date ddate) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.dtime = dtime;
		this.atime = atime;
		this.ddate = ddate;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getDtime() {
		return dtime;
	}

	public void setDtime(long dtime) {
		this.dtime = dtime;
	}

	public long getAtime() {
		return atime;
	}

	public void setAtime(long atime) {
		this.atime = atime;
	}
	
	public Date getDdate() {
		return ddate;
	}

	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", source=" + source + ", destination=" + destination + ", dtime=" + dtime
				+ ", atime=" + atime + ", ddate=" + ddate + "]";
	}

	
	
	
	
	

}
