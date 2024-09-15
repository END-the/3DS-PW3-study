package br.com.etechoracio.pw2_study.service;

import br.com.etechoracio.pw2_study.dto.DisciplinaResponseDTO;
import br.com.etechoracio.pw2_study.dto.MonitorResponseDTO;
import br.com.etechoracio.pw2_study.entity.Monitor;
import br.com.etechoracio.pw2_study.repository.MonitorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<MonitorResponseDTO> listar(){
        var monitors = repository.findAll();

        var resultado = monitors.stream().map(
                        e-> modelMapper.map(e, MonitorResponseDTO.class))
                .collect(Collectors.toList());

        return resultado;
    }


    public ResponseEntity<MonitorResponseDTO> buscarPorId(Long id) {

        var monitor = repository.findById(id);

        if (monitor.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            var resultado = modelMapper.map(monitor.get(), MonitorResponseDTO.class);
            return ResponseEntity.ok(resultado);
        }
    }

    public ResponseEntity<MonitorResponseDTO> inserir(Monitor monitor){
        var novoMonitor = ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monitor));

        var resultado = modelMapper.map(novoMonitor.getBody(), MonitorResponseDTO.class);

        return ResponseEntity.ok(resultado);

    }

    public ResponseEntity<MonitorResponseDTO> atualizar(Long id, Monitor monitor){
        var existe = repository.findById(id);
        if (existe.isEmpty()){
            return null;
        }
        else {
            var atuMonitor = ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monitor));

            var resultado = modelMapper.map(atuMonitor.getBody(), MonitorResponseDTO.class);

            return ResponseEntity.ok(resultado);
        }
    }


    public void delete(Long id){
        var existe = repository.findById(id);
        if (existe.isEmpty()){}
        else {
            repository.deleteById(id);
        }
    }

}
