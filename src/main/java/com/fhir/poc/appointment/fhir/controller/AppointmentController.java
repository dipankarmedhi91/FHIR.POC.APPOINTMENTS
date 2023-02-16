package com.fhir.poc.appointment.fhir.controller;

import com.fhir.poc.appointment.fhir.models.Appointment;
import com.fhir.poc.appointment.fhir.models.Patient;
import com.fhir.poc.appointment.fhir.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public ResponseEntity<?> getAllAppointments(){
        List<Appointment> list = appointmentService.getAllAppointments();
        return new ResponseEntity<List<Appointment>>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createAppointment(@RequestBody Appointment appointment){
        Appointment app = appointmentService.createAppointment(appointment);
        return new ResponseEntity<>(app, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateAppointment(@PathVariable String id, @RequestBody Appointment appointment){
        Appointment newAppointment = appointmentService.updateAppointment(id, appointment);
        return new ResponseEntity<Appointment>(newAppointment,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable String id){
        Appointment deletedAppointment =  appointmentService.deleteAppointment(id);
        return new ResponseEntity<Appointment>(deletedAppointment,HttpStatus.ACCEPTED);

    }

    @GetMapping("{id}")
    public ResponseEntity<?> getAppointmentById(@PathVariable String id){
        Appointment appointment =  appointmentService.getAppointmentById(id);
        return new ResponseEntity<Appointment>(appointment,HttpStatus.OK);
    }

}
