package com.gss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gss.domain.LoginDetails;

public interface LoginDetailsRepository extends MongoRepository<LoginDetails, String> {

}
