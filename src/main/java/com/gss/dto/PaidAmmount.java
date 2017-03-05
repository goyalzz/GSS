package com.gss.dto;

import java.util.Date;

import com.gss.domain.enums.PaymentMethod;

public class PaidAmmount {

  private Double paidAmmount;
  
  private Date paymentDate = new Date();
  
  private PaymentMethod paymentMethod = PaymentMethod.CASH;

  public Double getPaidAmmount() {
    return paidAmmount;
  }

  public void setPaidAmmount(Double paidAmmount) {
    this.paidAmmount = paidAmmount;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  
  
  
}
