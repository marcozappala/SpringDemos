package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {DemoApplication.class})
@EnableConfigurationProperties
public class DemoApplicationTests {

    @Value("${app.mappa.k1.a}")
    private String var;

    @Autowired
    private Filenames filenames;

    /*	@Value("${app.lista}")
      private List<String> lista;*/
    @Test
    public void contextLoads() {
        System.out.print(var);
//        filenames.getFilenames();
    }

}
