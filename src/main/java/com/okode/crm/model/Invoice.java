package com.okode.crm.model;

import org.springframework.data.annotation.TypeAlias;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@TypeAlias("invoice")
public class Invoice extends Form {

	private float amount;
	
	public float getAmount() {
		return amount;
	}
	
}
