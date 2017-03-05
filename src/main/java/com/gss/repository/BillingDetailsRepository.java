package com.gss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gss.domain.BillingDetails;

public interface BillingDetailsRepository extends MongoRepository<BillingDetails, String> {

}
