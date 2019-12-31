package com.iprimed.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Event {
	@Id
	@Column(name="event_id")
	private int eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@ManyToMany
	@JoinTable(name="JOIN_DELEGATE_EVENT",joinColumns={@JoinColumn(name="eventId")},inverseJoinColumns= {@JoinColumn(name="delegatedId")})
	private List<Delegate> delegate = new ArrayList<Delegate>();
	
	
	public Event() {}
	
	public Event(int eventId, String eventName, List<Delegate> delegate) {
		
		this.eventId = eventId;
		this.eventName = eventName;
		this.delegate = delegate;
	}



	public int getEventId() {
		return eventId;
	}
	public List<Delegate> getDelegate() {
		return delegate;
	}

	public void setDelegate(List<Delegate> delegate) {
		this.delegate = delegate;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	

}
