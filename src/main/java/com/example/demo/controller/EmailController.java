package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** Create by jony on 2020/6/16 */
@RestController
@ResponseBody
public class EmailController {

  @PostMapping("/email/{id}")
  public String addUser(@PathVariable("id") Long id) {
    return id + "@rest.local";
  }
}
