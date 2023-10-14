package com.insurance.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bill_Details")
public class Bill_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer Bill_Id;
	private Date DueDate;
	private Double MinimumPayment;
	private Date createdDate;
	private Double Balance;
	private Boolean Status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBill_Id() {
		return Bill_Id;
	}
	public void setBill_Id(Integer bill_Id) {
		Bill_Id = bill_Id;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Double getMinimumPayment() {
		return MinimumPayment;
	}
	public void setMinimumPayment(Double minimumPayment) {
		MinimumPayment = minimumPayment;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	
	

}
