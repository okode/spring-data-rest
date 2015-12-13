package com.okode.crm.model;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Invoice {
	
	@Id
	private String id;
	
	private String customer;
	private float amount;

	public String getCustomer() {
		return customer;
	}
	
	public float getAmount() {
		return amount;
	}
	
}
