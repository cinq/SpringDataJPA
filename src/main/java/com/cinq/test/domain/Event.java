package com.cinq.test.domain;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Event {

	@Column(nullable=false)
	private Long id;
	@Column(nullable=false)
	private String title;
	@Column
	private String description;
	@Column(nullable=false)
	private GregorianCalendar date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
	
}
