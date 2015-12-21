package com.okode.crm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.okode.crm.model.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {

	@Query("{ '_class': 'quote' }")
	Page<Quote> findAll(Pageable pageable);
	
}
