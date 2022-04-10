package com.finalClickonix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String t;
	private String f;
	private String m;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		t = t;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		f = f;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		m = m;
	}
	
	
}
