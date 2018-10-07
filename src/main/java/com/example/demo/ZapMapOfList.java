package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "zap-map-of-list")
public class ZapMapOfList {
    private Map<String, List<String>> whatever = new HashMap<>();

    public Map<String, List<String>> getWhatever() {
        return whatever;
    }

    public void setWhatever(Map<String, List<String>> whatever) {
        this.whatever = whatever;
    }
}