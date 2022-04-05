package com.finalClickonix.dto;

import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import com.finalClickonix.entity.Product;

public class ProductDTO {

	private int prrid;
	private String prname;
	private String prdisc;
	private String prcat;
	private String prprice;
	private String prquant;
	private MultipartFile prpic;
	private int prsid;
	public int getPrrid() {
		return prrid;
	}
	public void setPrrid(int prrid) {
		this.prrid = prrid;
	}
	public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public String getPrdisc() {
		return prdisc;
	}
	public void setPrdisc(String prdisc) {
		this.prdisc = prdisc;
	}
	public String getPrcat() {
		return prcat;
	}
	public void setPrcat(String prcat) {
		this.prcat = prcat;
	}
	public String getPrprice() {
		return prprice;
	}
	public void setPrprice(String prprice) {
		this.prprice = prprice;
	}
	public String getPrquant() {
		return prquant;
	}
	public void setPrquant(String prquant) {
		this.prquant = prquant;
	}
	public MultipartFile getPrpic() {
		return prpic;
	}
	public void setPrpic(MultipartFile prpic) {
		this.prpic = prpic;
	}
	public int getPrsid() {
		return prsid;
	}
	public void setPrsid(int prsid) {
		this.prsid = prsid;
	}
	
	public static Product toEntity(ProductDTO pdto) {
		Product entity = new Product();
		entity.setPname(pdto.getPrname());
		entity.setPcat(pdto.getPrcat());
		entity.setPdisc(pdto.getPrdisc());
		entity.setPquant(pdto.getPrquant());
		entity.setPrice(pdto.getPrprice());
		entity.setSid(pdto.getPrsid());
		
		return entity;
	}
}
