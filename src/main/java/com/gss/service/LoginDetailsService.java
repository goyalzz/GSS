package com.gss.service;

import org.springframework.data.domain.Page;

import com.gss.domain.LoginDetails;

public interface LoginDetailsService {
  
  public LoginDetails save(LoginDetails loginDetails);
  
  public LoginDetails findById(String id);
  
  public Page<LoginDetails> findAll();
  
}
