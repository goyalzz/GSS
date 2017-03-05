package com.gss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gss.domain.StockTypes;
import com.gss.dto.StockTypesRequestDto;
import com.gss.repository.StockTypesRepository;
import com.gss.service.StockTypesService;

@Service
public class StockTypesServiceImpl implements StockTypesService {

  @Autowired
  private StockTypesRepository stockTypesRepository;
  
  @Override
  public List<StockTypes> save(StockTypesRequestDto requestDto) {
    requestDto.getTypes().forEach(type -> {
      stockTypesRepository.save(new StockTypes(type));
    });
    return stockTypesRepository.findAll();
  }

  @Override
  public List<StockTypes> findAll() {
    return stockTypesRepository.findAll();
  }

}
