package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "app.lista")
public class Filenames {

    @Value("${app.mappa.k2.b}")
    private String b;

    public Filenames(@Value("${app.mappa.k2.a}") String a) {
    }

    @PostConstruct
    public void fillVariables() {
        System.out.print(b);
    }

//    private List<String> ignoredFilenames = new ArrayList<>();
//
//    public List<String> getFilenames() {
//        return this.ignoredFilenames;
//    }
}