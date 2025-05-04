package com.request.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		try {
			System.out.println("Iniciando o Servidor");
			SpringApplication.run(ApiApplication.class, args);
		} catch (Exception e) {
			System.err.println("Erro ao tentar iniciar servidor: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
