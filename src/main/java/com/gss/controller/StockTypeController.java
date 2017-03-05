package com.gss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gss.domain.StockTypes;
import com.gss.dto.StockTypesRequestDto;
import com.gss.service.StockTypesService;
import com.gss.utils.RestResponse;

@RestController
@RequestMapping(value = "/stockType")
public class StockTypeController {

  @Autowired
  private StockTypesService stockTypesService;

  @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<RestResponse<List<StockTypes>>> saveStock(@RequestBody StockTypesRequestDto stockTypes) {
    return new ResponseEntity<>(new RestResponse<List<StockTypes>>(stockTypesService.save(stockTypes)),
        HttpStatus.OK);
  }
  
  @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<RestResponse<List<StockTypes>>> getStock() {
    return new ResponseEntity<>(new RestResponse<List<StockTypes>>(stockTypesService.findAll()),
        HttpStatus.OK);
  }

}
