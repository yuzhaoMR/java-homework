package com.example.emailapi.controller;

import org.springframework.web.bind.annotation.*;

/** Create by jony on 2020/6/16 */
@RestController
@ResponseBody
public class EmailController {

  @GetMapping("/email/{account}")
  public String getEmail(@PathVariable("account") String account) {
    return account + "@rest.local";
  }
}
