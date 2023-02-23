package com.fhir.poc.appointment.fhir.controller;

import com.fhir.poc.appointment.fhir.models.Patient;
import com.fhir.poc.appointment.fhir.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping
    public ResponseEntity<?> getALlPatient(){
        List<Patient> list = patientService.findAllPatients();
        return new ResponseEntity<List<Patient>>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createPatient(@RequestBody Patient patient){
        System.out.println("--------------"+patient);
        Patient p = patientService.createPatient(patient);
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public Patient updatePatient(@PathVariable String id, @RequestBody Patient patient){
        Patient patient1 = patientService.updatePatient(id, patient);
        return patient1;
    }

    @DeleteMapping("{id}")
    public Patient deletePatient(@PathVariable String id){
        return patientService.deletePatient(id);
    }

    @GetMapping("{id}")
    public Patient getPatientById(@PathVariable String id){
        return patientService.getPatientById(id);
    }
}
