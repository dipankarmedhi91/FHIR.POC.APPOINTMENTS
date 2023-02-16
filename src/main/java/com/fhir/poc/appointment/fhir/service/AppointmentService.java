package com.fhir.poc.appointment.fhir.service;

import com.fhir.poc.appointment.fhir.models.Appointment;
import com.fhir.poc.appointment.fhir.models.Patient;
import com.fhir.poc.appointment.fhir.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    public List<Appointment> getAllAppointments() {
      return appointmentRepository.findAll();
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(String id, Appointment appointment) {
        Appointment currAppointment = appointmentRepository.findById(id).get();
        currAppointment.setStatus(appointment.getStatus());
        appointmentRepository.save(currAppointment);
        return currAppointment;
    }


    public Appointment deleteAppointment(String id) {
        Appointment appointment = appointmentRepository.findById(id).get();
        appointmentRepository.delete(appointment);
        return appointment;
    }

    public Appointment getAppointmentById(String id) {
        return appointmentRepository.findById(id).get();
    }
}
