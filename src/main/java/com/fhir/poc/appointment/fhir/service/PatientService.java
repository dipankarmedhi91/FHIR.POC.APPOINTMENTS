package com.fhir.poc.appointment.fhir.service;


import com.fhir.poc.appointment.fhir.models.Patient;
import com.fhir.poc.appointment.fhir.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);

    }

    public Patient updatePatient(String id, Patient patient) {
        Patient p = patientRepository.findById(id).get();
        p.setBirthDate(patient.getBirthDate());
        patientRepository.save(p);

        return p;
    }

    public Patient deletePatient(String id) {
        Patient p = patientRepository.findById(id).get();
        patientRepository.delete(p);
        return p;
    }

    public Patient getPatientById(String id) {
        return patientRepository.findById(id).get();
    }
}
