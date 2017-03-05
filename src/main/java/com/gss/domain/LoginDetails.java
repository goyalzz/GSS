package com.gss.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gss.domain.enums.LoginPermissions;

@Document
public class LoginDetails {

  @Id
  private String id;
  
  @NotNull(message = "Name is not null !!!")
  @NotEmpty(message = "Name cannot be Empty !!!")
  private String name;
  
  @NotNull(message = "User Name is not null !!!")
  @NotEmpty(message = "User Name cannot be Empty !!!")
  private String username;
  
  private String password;
  
  private LoginPermissions userType;

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

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginPermissions getUserType() {
    return userType;
  }

  public void setUserType(LoginPermissions userType) {
    this.userType = userType;
  }

  @Override
  public String toString() {
    return "LoginDetails [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
        + ", userType=" + userType + "]";
  }
  
}
