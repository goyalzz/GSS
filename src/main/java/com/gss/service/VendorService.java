package com.gss.service;

import org.springframework.data.domain.Page;

import com.gss.domain.VendorDetails;

public interface VendorService {

  public VendorDetails save(VendorDetails vendorDetails);
  
  public Page<VendorDetails> findAll();
  
}
