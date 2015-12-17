package com.okode.crm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Document(collection = "crm")
public class Form {

	@Id
	private String id;
	
	private String customer;
	
	public String getCustomer() {
		return customer;
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
}
