package com.example.demo;

import java.util.Arrays;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Variables {

    @Value("${app.m.mappa.k1}")
    private String b;

    @Value("${app.lista}")
    private String[] lista;


    public Variables(@Value("${app.m.mappa.k2}") String a) {
        System.out.println(a);
    }

    @PostConstruct
    public void fillVariables() {
        System.out.println(b);
        for (String s: Arrays.asList(lista)){
            System.out.println(s);
        }
    }

}