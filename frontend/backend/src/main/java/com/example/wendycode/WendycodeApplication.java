package com.example.wendycode;

import com.example.wendycode.entity.Employee;
import com.example.wendycode.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WendycodeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WendycodeApplication.class, args);
	}
		@Autowired
		private EmployeeRepository employeeRepository;
		@Override
		public void run (String...args) throws Exception {
			Employee employee1 = Employee.builder()
					.firstName("Wendy")
					.lastName("Chiang")
					.email("wendy@gmail.com")
					.build();

			Employee employee2 = Employee.builder()
					.firstName("Lily")
					.lastName("Potter")
					.email("lily@gmail.com")
					.build();

			Employee employee3 = Employee.builder()
					.firstName("James")
					.lastName("Potter")
					.email("potter@gmail.com")
					.build();

			employeeRepository.save(employee1);
			employeeRepository.save(employee2);
			employeeRepository.save(employee3);

		}

}
