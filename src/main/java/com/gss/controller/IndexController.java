package com.gss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gss.utils.RestResponse;

@RestController
public class IndexController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<RestResponse<String>> index() {
    return new ResponseEntity<>(new RestResponse<String>("Server Started !!!"), HttpStatus.ACCEPTED);
  }
  
}
