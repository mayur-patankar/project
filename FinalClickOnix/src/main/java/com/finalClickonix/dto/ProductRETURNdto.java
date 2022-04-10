package com.finalClickonix.dto;

import org.springframework.core.io.Resource;

public class ProductRETURNdto {
	
	private int prid;
	private String pname;
	private String pdisc;
	private String pcat;
	private String pprice;
	private String pquant;
	private Resource pic;
	private int sid;
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
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPquant() {
		return pquant;
	}
	public void setPquant(String pquant) {
		this.pquant = pquant;
	}
	public Resource getPic() {
		return pic;
	}
	public void setPic(Resource pic) {
		this.pic = pic;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
}
