package com.rouchi.config;


import com.rouchi.api.AzkabanApi;
import com.rouchi.proxy.AzkabanApiProxyBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Luca on 2021-6-3 15:58:09
 * 配置API，创建Bean，并注入Spring
 */
@Configuration
public class AzkabanApiConfig {
    @Value("${azkaban.url}")
    private String uri;

    @Value("${azkaban.username}")
    private String username;

    @Value("${azkaban.password}")
    private String password;

    @Bean
    public AzkabanApi azkabanApi() {
        return AzkabanApiProxyBuilder.create()
                .setUri(uri)
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}
