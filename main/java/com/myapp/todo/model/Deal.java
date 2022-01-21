package com.myapp.todo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Deal")
public class Deal {
	
	@GeneratedValue
	@Id
	Integer dealId;
	@Column
	Integer quantity; 
	@Column
	String startTime;
	@Column
	String endTime;
	@Column
	Boolean isDEalActive;
	Deal(){
		
	}
	
	public Deal(Integer quantity, String startTime, String endTime, Boolean isDEalActive) {
		super();
		
		this.quantity = quantity;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isDEalActive = isDEalActive;
	}
	@Override
	public String toString() {
		return "Deal [dealId=" + dealId + ", quantity=" + quantity + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", isDEalActive=" + isDEalActive + "]";
	}
	
	
	
	public Integer getDealId() {
		return dealId;
	}
	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Boolean getIsDEalActive() {
		return isDEalActive;
	}
	public void setIsDEalActive(Boolean isDEalActive) {
		this.isDEalActive = isDEalActive;
	} 
	
	
	

}
