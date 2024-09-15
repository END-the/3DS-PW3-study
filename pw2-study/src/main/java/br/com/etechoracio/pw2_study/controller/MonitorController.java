package br.com.etechoracio.pw2_study.controller;

import br.com.etechoracio.pw2_study.dto.DisciplinaResponseDTO;
import br.com.etechoracio.pw2_study.dto.MonitorResponseDTO;
import br.com.etechoracio.pw2_study.entity.Monitor;
import br.com.etechoracio.pw2_study.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitores")
public class MonitorController {

    @Autowired
    private MonitorService service;

    @GetMapping
    public List<MonitorResponseDTO> listar(){
        return service.listar();
    }


    @GetMapping("/id")
    public ResponseEntity<MonitorResponseDTO> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }


    @PostMapping
    public ResponseEntity<MonitorResponseDTO> inserir(@RequestBody Monitor monitor){
        return service.inserir(monitor);
    }


    @PutMapping("/{id}")//PUT
    public ResponseEntity<MonitorResponseDTO> atualizar(@PathVariable Long id, @RequestBody Monitor monitor){
        return service.atualizar(id, monitor);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
