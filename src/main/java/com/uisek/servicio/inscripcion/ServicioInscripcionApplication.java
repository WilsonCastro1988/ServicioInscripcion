package com.uisek.servicio.inscripcion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.uisek.servicio.commons.model.entity"})
public class ServicioInscripcionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioInscripcionApplication.class, args);
	}

}
