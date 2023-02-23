package com.fhir.poc.appointment.fhir.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.net.URLEncoder;

@RestController
public class SmartPatientController {

    @GetMapping("/smart/configuration")
    public ResponseEntity<?> getSmartConfiguration(){
        String url = "https://launch.smarthealthit.org/v/r4/sim/WzQsIiIsIiIsIiIsMCwwLDAsIiIsIiIsIiIsIiIsIiIsIiIsIiIsMCwxXQ/fhir/.well-known/smart-configuration";
        RestTemplate restTemplate = new RestTemplate();
        Object configuration = restTemplate.getForObject(url,Object.class);
        System.out.println(configuration);
        return new ResponseEntity<Object>(configuration, HttpStatus.OK);
    }
    @GetMapping("/smart/patients")
    public ResponseEntity<?> getSmartPatient(){
        String url = "https://launch.smarthealthit.org/v/r4/sim/WzQsIiIsIiIsIiIsMCwwLDAsIiIsIiIsIiIsIiIsIiIsIiIsIiIsMCwxXQ/fhir/Patient";
        RestTemplate restTemplate = new RestTemplate();
        Object patient = restTemplate.getForObject(url,Object.class);
        return new ResponseEntity<Object>(patient, HttpStatus.OK);
    }
}
