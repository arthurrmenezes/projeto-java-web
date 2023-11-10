package br.com.arthurrmenezes.projetojavaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoJavaWebApplication {

	public static void main(String[] args) {
		System.out.println("Primeiro projeto Spring está funcionando!");
		SpringApplication.run(ProjetoJavaWebApplication.class, args);
	}

}
