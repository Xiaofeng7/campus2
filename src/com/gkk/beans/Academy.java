package com.gkk.beans;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Academy {

	private int id;
	private String name;
	private int countId;
	private Set<Profession> professionList = new HashSet<Profession>();
	private Timestamp time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
	public Set<Profession> getProfessionList() {
		return professionList;
	}
	public void setProfessionList(Set<Profession> professionList) {
		this.professionList = professionList;
	}
	public int getCountId() {
		return countId;
	}
	public void setCountId(int countId) {
		this.countId = countId;
	}
}
