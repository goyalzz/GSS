package com.gss.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.gss.domain.enums.BillingType;

public class BillingDetailsRequestDto {

  @NotNull(message = "Customer name cannot be null")
  private String customerName;
  
  @NotNull(message = "Customer village name cannot be null")
  private String customerVillage;
  
  @NotNull(message = "Customer mobile number cannot be null")
  private Long customerMobile;
  
  private List<Item> perticulars = new ArrayList<>();
  
  private List<PaidAmmount> paidAmmount;
  
  private BillingType billingType = BillingType.ESTIMATE;

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerVillage() {
    return customerVillage;
  }

  public void setCustomerVillage(String customerVillage) {
    this.customerVillage = customerVillage;
  }

  public Long getCustomerMobile() {
    return customerMobile;
  }

  public void setCustomerMobile(Long customerMobile) {
    this.customerMobile = customerMobile;
  }

  public List<Item> getPerticulars() {
    return perticulars;
  }

  public void setPerticulars(List<Item> perticulars) {
    this.perticulars = perticulars;
  }

  public List<PaidAmmount> getPaidAmmount() {
    return paidAmmount;
  }

  public void setPaidAmmount(List<PaidAmmount> paidAmmount) {
    this.paidAmmount = paidAmmount;
  }

  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  @Override
  public String toString() {
    return "BillingDetailsRequestDto [customerName=" + customerName + ", customerVillage=" + customerVillage
        + ", customerMobile=" + customerMobile + ", perticulars=" + perticulars + ", paidAmmount=" + paidAmmount + ", billingType=" + billingType + "]";
  }
}
