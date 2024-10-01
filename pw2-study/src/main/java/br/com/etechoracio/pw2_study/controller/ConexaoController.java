package br.com.etechoracio.pw2_study.controller;

import br.com.etechoracio.pw2_study.dto.ConexaoReponseDTO;
import br.com.etechoracio.pw2_study.service.ConexaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conexoes")
@CrossOrigin(origins="*")
public class ConexaoController {

    @Autowired
    private ConexaoService service;

    @GetMapping
    public Long contarConexoes(){
        return service.contarConexoes();
    }
}
