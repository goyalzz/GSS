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

import com.gss.domain.LoginDetails;
import com.gss.service.LoginDetailsService;
import com.gss.utils.RestResponse;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

  @Autowired
  private LoginDetailsService loginDetailsService;

  @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<RestResponse<LoginDetails>> signIp(@Valid @RequestBody LoginDetails loginDetails) {
    return new ResponseEntity<>(new RestResponse<LoginDetails>(loginDetailsService.save(loginDetails)),
        HttpStatus.OK);
  }
  
  @RequestMapping(value = {"","/"}, method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<RestResponse<Page<LoginDetails>>> getLoginDetails() {
    return new ResponseEntity<>(new RestResponse<Page<LoginDetails>>(loginDetailsService.findAll()),
        HttpStatus.OK);
  }

}
