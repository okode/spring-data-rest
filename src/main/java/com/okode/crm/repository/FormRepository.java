package com.okode.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.okode.crm.model.Form;

public interface FormRepository extends MongoRepository<Form, String> {

}
