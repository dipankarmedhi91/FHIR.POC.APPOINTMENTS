package com.fhir.poc.appointment.fhir.repository;

import com.fhir.poc.appointment.fhir.models.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {
}
