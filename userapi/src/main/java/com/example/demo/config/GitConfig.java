package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Create by jony on 2020/6/19
 */
@Data
@Component
public class GitConfig {

    @Value("${datasource.password}")
    private String dataSourcePassword;

    @Value("${datasource.username}")
    private String dataSourceUsername;

    @Value("${datasource.url}")
    private String dataSourceUrl;

    @Value("${eureka.url}")
    private String eurekaUrl;

    @Value("${server.port}")
    private String serverPort;
}
