package com.gss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gss.domain.StockTypes;

public interface StockTypesRepository extends MongoRepository<StockTypes, String> {

}
