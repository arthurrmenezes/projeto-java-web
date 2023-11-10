package br.com.arthurrmenezes.projetojavaweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ProjetoJavaWebApplicationTests {

	private BigDecimal meuSalarioDeProgramador = new BigDecimal("10.00");

	@Test
	void contextLoads() {
		System.out.println("Começando o debug");
		System.out.println("O salário de programador é: "+ meuSalarioDeProgramador);
		System.out.println("Fim do debug");
	}

}
