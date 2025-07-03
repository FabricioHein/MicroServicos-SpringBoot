package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer days;
	private Double dailyIncome;


	
	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.days = days;
		this.dailyIncome = dailyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	
	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}
	
	public double getTotal() {
		return days * dailyIncome;
	}

	
	

}
