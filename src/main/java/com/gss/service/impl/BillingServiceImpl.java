package com.gss.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gss.domain.BillingDetails;
import com.gss.domain.enums.PaymentType;
import com.gss.dto.BillingDetailsRequestDto;
import com.gss.dto.Item;
import com.gss.dto.PaidAmmount;
import com.gss.repository.BillingDetailsRepository;
import com.gss.service.BillingDetailsService;

@Service
public class BillingServiceImpl implements BillingDetailsService {

  @Autowired
  private BillingDetailsRepository billingDetailsRepository;
  
  @Override
  public BillingDetails save(BillingDetailsRequestDto billingDetailsRequestDto) {
    BillingDetails details = getGrandTotal(billingDetailsRequestDto);
    Double paidAmmount = 0d;
    for(PaidAmmount paid : details.getPaidAmmount()) {
      paidAmmount = paidAmmount + paid.getPaidAmmount();
    }
    if(Math.ceil(details.getGrandTotal()) <= Math.ceil(paidAmmount)) {
      details.setPaymentType(PaymentType.PAID);
    }
    return billingDetailsRepository.save(details);
  }
  
  private BillingDetails getGrandTotal(BillingDetailsRequestDto billingDetails) {
    int sno = 1;
    double grandTotal = 0;
    for(Item item : billingDetails.getPerticulars()) {
      item.setSno(sno);
      grandTotal = grandTotal + item.getTotal();
      sno++;
    }
    BillingDetails details = new BillingDetails();
    BeanUtils.copyProperties(billingDetails, details);
    details.setGrandTotal(grandTotal);
    details.setBillNumber(billingDetailsRepository.count() + 1);
    return details;
  }

  @Override
  public Page<BillingDetails> findAll() {
    Pageable pageAble = new PageRequest(1, 10);
    return billingDetailsRepository.findAll(pageAble);
  }
  
}
