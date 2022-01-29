package com.bidding.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	int id;
	String prod_name;
	String expire_date;
	String discription;
	String Category;
	String StartPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getStartPrice() {
		return StartPrice;
	}
	public void setStartPrice(String startPrice) {
		StartPrice = startPrice;
	}
	
	
}
