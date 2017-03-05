package com.gss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gss.domain.VendorDetails;

public interface VendorDetailsRepository extends MongoRepository<VendorDetails, String> {

}
