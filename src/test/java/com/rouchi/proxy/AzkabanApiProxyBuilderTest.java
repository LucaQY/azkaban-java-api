package com.rouchi.proxy;

import com.rouchi.api.AzkabanApi;
import org.junit.Test;

/**
 * Created by shirukai on 2019-06-13 15:16
 */
public class AzkabanApiProxyBuilderTest {
    @Test
    public void builder() {
        AzkabanApi apis = AzkabanApiProxyBuilder.create()
                .setUri("http://localhost:8666")
                .setUsername("azkaban")
                .setPassword("azkaban")
                .build();
    }
}