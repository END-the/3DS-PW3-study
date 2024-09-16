package br.com.etechoracio.pw2_study.controller;

import br.com.etechoracio.pw2_study.dto.DisciplinaResponseDTO;
import br.com.etechoracio.pw2_study.repository.DisciplinaRepository;
import br.com.etechoracio.pw2_study.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<DisciplinaResponseDTO> listar(){
        return service.listar();
    }

}
