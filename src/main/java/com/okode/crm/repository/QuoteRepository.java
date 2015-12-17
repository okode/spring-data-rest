package com.okode.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.okode.crm.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

}
