package com.example.demo;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {DemoApplication.class})
public class DemoApplicationTests {

    @Autowired
    private ZapMap zapMap;

    @Autowired
    private ZapMapOfList zapMapOfList;

    @Autowired
    private ZapMapOfMap zapMapOfMap;

    @Test
    public void contextLoads() {
        for (Map.Entry<String, String> entry: zapMap.getMappa().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }

        for (Map.Entry<String, List<String>> entry: zapMapOfList.getWhatever().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }

        for (Map.Entry<String, Map<String,String>> entry: zapMapOfMap.getMap().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
    }

}
