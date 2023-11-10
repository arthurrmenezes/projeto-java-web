package br.com.arthurrmenezes.projetojavaweb.controller;

import br.com.arthurrmenezes.projetojavaweb.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios {

    public BigDecimal salarioProgramador() {
        Salarios salarioProgramador = new Salarios();
        salarioProgramador.setMeuSalarioDeProgramador(new BigDecimal(10.00));

        return salarioProgramador.getMeuSalarioDeProgramador();
    }

    public Salarios todosOsSalarios() {
        Salarios salarios = new Salarios(new BigDecimal(10.00), new BigDecimal(20.00));

        return salarios;
    }


}
