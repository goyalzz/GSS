package com.gss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gss.domain.LoginDetails;
import com.gss.repository.LoginDetailsRepository;
import com.gss.service.LoginDetailsService;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {

  @Autowired
  private LoginDetailsRepository loginDetailsRepository;
  
  @Override
  public LoginDetails save(LoginDetails loginDetails) {
    return loginDetailsRepository.save(loginDetails);
  }
  
  @Override
  public LoginDetails findById(String id) {
    return loginDetailsRepository.findOne(id);
  }

  @Override
  public Page<LoginDetails> findAll() {
    Pageable pageAble = new PageRequest(1, 10);
    return loginDetailsRepository.findAll(pageAble);
  }
  
}
