package com.okode.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.okode.crm.model.Invoice;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}
