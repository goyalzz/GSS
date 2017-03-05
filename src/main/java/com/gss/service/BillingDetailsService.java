package com.gss.service;

import org.springframework.data.domain.Page;

import com.gss.domain.BillingDetails;
import com.gss.dto.BillingDetailsRequestDto;

public interface BillingDetailsService {

  public BillingDetails save(BillingDetailsRequestDto billingDetailsRequestDto);
  
  public Page<BillingDetails> findAll();
  
}
