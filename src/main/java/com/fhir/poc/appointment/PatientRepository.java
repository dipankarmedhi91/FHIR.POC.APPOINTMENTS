package com.fhir.poc.appointment;

import com.fhir.poc.appointment.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient,String> {

}
