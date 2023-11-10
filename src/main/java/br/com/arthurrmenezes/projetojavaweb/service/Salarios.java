package br.com.arthurrmenezes.projetojavaweb.service;

import br.com.arthurrmenezes.projetojavaweb.controller.GeradorDeSalarios;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salarios {

    @Autowired
    private GeradorDeSalarios geraSalario;

    @ResponseBody
    @RequestMapping (method = RequestMethod.GET,
    path = "salario-programador", produces = MediaType.APPLICATION_JSON)
        public ResponseEntity<?> getSalarioProgramador() {
            return new ResponseEntity<>(geraSalario.salarioProgramador(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping (method = RequestMethod.GET,
            path = "todos-salarios", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getTodosSalarios() {
        return new ResponseEntity<>(geraSalario.todosOsSalarios(), HttpStatus.OK);
    }

}
