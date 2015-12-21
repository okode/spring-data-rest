package com.okode.crm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.okode.crm.model.Invoice;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
	
	@Query("{ '_class': 'invoice' }")
	Page<Invoice> findAll(Pageable pageable);
	
}
