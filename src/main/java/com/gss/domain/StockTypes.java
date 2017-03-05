package com.gss.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StockTypes {

  @Id
  private String type;

  public StockTypes(String type) {
    super();
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "StockTypes [type=" + type + "]";
  }
  
}