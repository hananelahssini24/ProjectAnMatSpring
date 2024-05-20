package com.lahssini.demoan;

import com.lahssini.demoan.entities.Employe;
import com.lahssini.demoan.repository.EmployeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class DemoAnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAnApplication.class, args);
		System.out.println("hanane");
	}

@Bean
CommandLineRunner commandLineRunner(EmployeRepository employeRepository){
	return args-> {
		employeRepository.save(Employe.builder()
				.firstName("lahssini")
						.lastName("hanane")
						.date(LocalDate.now())
				.build());

				employeRepository.save(Employe.builder()
				.firstName("lahssini")
						.lastName("janat")
						.date(LocalDate.now())
				.build());
	};
	}

}
