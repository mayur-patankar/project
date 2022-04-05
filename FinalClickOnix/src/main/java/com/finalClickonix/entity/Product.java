package com.finalClickonix.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prid;
	private String pname;
	private String pdisc;
	private String pcat;
	private String pprice;
	private String pquant;
	private String pic;
	private int sid;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int id) {
		this.sid = id;
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdisc() {
		return pdisc;
	}
	public void setPdisc(String pdisc) {
		this.pdisc = pdisc;
	}
	public String getPcat() {
		return pcat;
	}
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	public String getPrice() {
		return pprice;
	}
	public void setPrice(String price) {
		this.pprice = price;
	}
	public String getPquant() {
		return pquant;
	}
	public void setPquant(String pquant) {
		this.pquant = pquant;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
}
