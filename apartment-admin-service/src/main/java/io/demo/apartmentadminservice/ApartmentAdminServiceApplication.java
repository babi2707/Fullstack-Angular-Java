package io.demo.apartmentadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApartmentAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentAdminServiceApplication.class, args);
	}
}
