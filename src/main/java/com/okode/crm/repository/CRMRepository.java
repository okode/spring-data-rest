package com.okode.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.okode.crm.model.CRM;

public interface CRMRepository extends MongoRepository<CRM, String> {

}
