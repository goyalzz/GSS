package com.gss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gss.domain.VendorDetails;
import com.gss.repository.VendorDetailsRepository;
import com.gss.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

  @Autowired
  private VendorDetailsRepository vendorDetailsRepository;
  
  @Override
  public VendorDetails save(VendorDetails vendorDetails) {
    return vendorDetailsRepository.save(vendorDetails);
  }
  
  @Override
  public Page<VendorDetails> findAll() {
    Pageable pageAble = new PageRequest(1, 10);
    return vendorDetailsRepository.findAll(pageAble);
  }
  
}