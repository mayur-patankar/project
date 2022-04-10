package com.finalClickonix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private long prid;
	private int Quantity;
	private int sum;
	
	@Override
	public String toString() {
		return "Cart [uid=" + uid + ", prid=" + prid + ", Quantity=" + Quantity + ", sum=" + sum + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public long getPrid() {
		return prid;
	}
	public void setPrid(long prid) {
		this.prid = prid;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	

}
