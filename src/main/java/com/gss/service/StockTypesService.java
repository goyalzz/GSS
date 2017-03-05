package com.gss.service;

import java.util.List;

import com.gss.domain.StockTypes;
import com.gss.dto.StockTypesRequestDto;

public interface StockTypesService {
  
  public List<StockTypes> save(StockTypesRequestDto stockTypes);
  
  public List<StockTypes> findAll();
  
}
