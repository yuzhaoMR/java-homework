package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/** Create by jony on 2020/6/16 */
@RestController
@ResponseBody
public class EmailController {

  @GetMapping("/email/{id}")
  public String getEmail(@PathVariable("id") Long id) {
    return id + "@rest.local";
  }
}
