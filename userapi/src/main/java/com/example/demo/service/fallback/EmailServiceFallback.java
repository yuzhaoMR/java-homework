package com.example.demo.service.fallback;

import com.example.demo.service.IEmailService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/** Create by jony on 2020/6/17 */
@Slf4j
@Component
public class EmailServiceFallback implements FallbackFactory<IEmailService> {

  @Override
  public IEmailService create(Throwable throwable) {
    return name -> {
      log.error("调用email服务出错", throwable);
      return "调用出错";
    };
  }
}
