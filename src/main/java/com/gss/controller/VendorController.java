package com.gss.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gss.domain.VendorDetails;
import com.gss.service.VendorService;
import com.gss.utils.RestResponse;

@RestController
@RequestMapping(value = "/vendor")
public class VendorController {

  @Autowired
  private VendorService vendorService;

  @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<RestResponse<VendorDetails>> saveVendor(@Valid @RequestBody VendorDetails vendorDetails) {
    return new ResponseEntity<>(new RestResponse<VendorDetails>(vendorService.save(vendorDetails)), HttpStatus.OK);
  }

  @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<RestResponse<Page<VendorDetails>>> getVendors(@Valid @RequestBody VendorDetails vendorDetails) {
    return new ResponseEntity<>(new RestResponse<Page<VendorDetails>>(vendorService.findAll()), HttpStatus.OK);
  }

}
