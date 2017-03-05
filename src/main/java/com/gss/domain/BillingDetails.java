package com.gss.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gss.domain.enums.BillingType;
import com.gss.domain.enums.PaymentType;
import com.gss.dto.Item;
import com.gss.dto.PaidAmmount;

@Document
public class BillingDetails {

  @Id
  private String id;

  private Long billNumber;

  private String customerName;

  private String customerVillage;

  private Long customerMobile;

  private List<Item> perticulars;

  private Date billingDate = new Date();

  private Double grandTotal;

  private List<PaidAmmount> paidAmmount;

  private PaymentType paymentType = PaymentType.UNPAID;

  private BillingType billingType = BillingType.ESTIMATE;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Long getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(Long billNumber) {
    this.billNumber = billNumber;
  }

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

  public Date getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(Date billingDate) {
    this.billingDate = billingDate;
  }

  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public List<PaidAmmount> getPaidAmmount() {
    return paidAmmount;
  }

  public void setPaidAmmount(List<PaidAmmount> paidAmmount) {
    this.paidAmmount = paidAmmount;
  }

  public PaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public BillingType getBillingType() {
    return billingType;
  }

  public void setBillingType(BillingType billingType) {
    this.billingType = billingType;
  }

  @Override
  public String toString() {
    return "BillingDetails [id=" + id + ", billNumber=" + billNumber + ", customerName=" + customerName
        + ", customerVillage=" + customerVillage + ", customerMobile=" + customerMobile + ", perticulars=" + perticulars
        + ", billingDate=" + billingDate + ", grandTotal=" + grandTotal + ", paidAmmount=" + paidAmmount
        + ", paymentType=" + paymentType + ", billingType=" + billingType + "]";
  }

}
