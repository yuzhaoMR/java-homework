package com.example.demo.service;

import com.example.demo.service.fallback.EmailServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Create by jony on 2020/6/17
 */
@FeignClient(value = "emailapi", contextId = "email", fallbackFactory = EmailServiceFallback.class)
public interface IEmailService {

    @GetMapping("/email/{account}")
    String getEmail(@PathVariable("account") String account);
}
