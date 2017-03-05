package com.gss.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gss.domain.BillingDetails;
import com.gss.dto.BillingDetailsRequestDto;
import com.gss.service.BillingDetailsService;
import com.gss.utils.RestResponse;

@RestController
@RequestMapping(value = "/billing")
public class BillingController {

  @Autowired
  private BillingDetailsService billingDetailsService;

  @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<RestResponse<BillingDetails>> createBill(
      @Valid @RequestBody BillingDetailsRequestDto billingDetailsRequestDto) {
    return new ResponseEntity<>(new RestResponse<BillingDetails>(billingDetailsService.save(billingDetailsRequestDto)),
        HttpStatus.OK);
  }

  @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<RestResponse<Page<BillingDetails>>> getBills(
      @Valid @RequestBody BillingDetailsRequestDto billingDetailsRequestDto) {
    return new ResponseEntity<>(new RestResponse<Page<BillingDetails>>(billingDetailsService.findAll()), HttpStatus.OK);
  }

}
