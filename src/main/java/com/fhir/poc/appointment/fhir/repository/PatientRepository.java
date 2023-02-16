package com.fhir.poc.appointment.fhir.repository;

import com.fhir.poc.appointment.fhir.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient,String > {
}
