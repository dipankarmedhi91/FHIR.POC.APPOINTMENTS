package com.fhir.poc.appointment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PatientRepository repository){
		return args -> {
			Patient patient = new Patient("John","Doe","John@gmail.com",30,"male");

			repository.insert(patient);
		};
	}


}
