package com.gss.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gss.dto.Item;

@Document
public class VendorDetails {

  @Id
  private String id;
  
  private String name;
  
  private String firmname;
  
  private String firmLocation;
  
  private List<Item> billingDetails;
  
  private String billNumber;
  
  private String paidAmmount;
  
  private String billDate;
  
  private String reportingPersionName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirmname() {
    return firmname;
  }

  public void setFirmname(String firmname) {
    this.firmname = firmname;
  }

  public String getFirmLocation() {
    return firmLocation;
  }

  public void setFirmLocation(String firmLocation) {
    this.firmLocation = firmLocation;
  }

  public List<Item> getBillingDetails() {
    return billingDetails;
  }

  public void setBillingDetails(List<Item> billingDetails) {
    this.billingDetails = billingDetails;
  }

  public String getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;
  }

  public String getPaidAmmount() {
    return paidAmmount;
  }

  public void setPaidAmmount(String paidAmmount) {
    this.paidAmmount = paidAmmount;
  }

  public String getBillDate() {
    return billDate;
  }

  public void setBillDate(String billDate) {
    this.billDate = billDate;
  }

  public String getReportingPersionName() {
    return reportingPersionName;
  }

  public void setReportingPersionName(String reportingPersionName) {
    this.reportingPersionName = reportingPersionName;
  }

  @Override
  public String toString() {
    return "VendorDetails [id=" + id + ", name=" + name + ", firmname=" + firmname + ", firmLocation=" + firmLocation
        + ", billingDetails=" + billingDetails + ", billNumber=" + billNumber + ", paidAmmount=" + paidAmmount
        + ", billDate=" + billDate + ", reportingPersionName=" + reportingPersionName + "]";
  }
  
}