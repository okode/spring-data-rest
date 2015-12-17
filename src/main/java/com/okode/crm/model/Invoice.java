package com.okode.crm.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Document(collection = "crm")
public class Invoice extends Form {
		
	private float amount;
	
	public float getAmount() {
		return amount;
	}
	
}
