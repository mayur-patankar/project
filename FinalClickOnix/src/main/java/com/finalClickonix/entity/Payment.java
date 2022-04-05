package com.finalClickonix.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int paymentId;
private long cardNo;
private int cvv;

@Column(name="Payment_Date")
private Date createdTimestamp=new Date();

public int getPaymentId() {
	return paymentId;
}

public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

public long getCardNo() {
	return cardNo;
}

public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
}

public int getCvv() {
	return cvv;
}

public void setCvv(int cvv) {
	this.cvv = cvv;
}

public Date getCreatedTimestamp() {
	return createdTimestamp;
}

public void setCreatedTimestamp(Date createdTimestamp) {
	this.createdTimestamp = createdTimestamp;
}

@Override
public String toString() {
	return "Payment [paymentId=" + paymentId + ", cardNo=" + cardNo + ", cvv=" + cvv + ", createdTimestamp="
			+ createdTimestamp + "]";
}






}
