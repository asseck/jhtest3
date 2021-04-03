package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.Jhtest123App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = Jhtest123App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
