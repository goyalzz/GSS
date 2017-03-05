package com.gss.dto;

public class Item {
  
  private Integer sno;
  
  private String perticular;
  
  private Double price;
  
  private Integer numberOfItems;
  
  private Double total;

  public Integer getSno() {
    return sno;
  }

  public void setSno(Integer sno) {
    this.sno = sno;
  }

  public String getPerticular() {
    return perticular;
  }

  public void setPerticular(String perticular) {
    this.perticular = perticular;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(Integer numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Item [sno=" + sno + ", perticular=" + perticular + ", price=" + price + ", numberOfItems=" + numberOfItems
        + ", total=" + total + "]";
  }

}
