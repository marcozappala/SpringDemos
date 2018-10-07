package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app.m")
public class ZapMap {

    private Map<String, String> mappa = new HashMap<>();

    public Map<String, String> getMappa() {
        return mappa;
    }

    public void setMappa(Map<String, String> mappa) {
        this.mappa = mappa;
    }
}