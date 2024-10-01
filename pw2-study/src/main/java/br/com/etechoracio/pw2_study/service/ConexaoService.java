package br.com.etechoracio.pw2_study.service;

import br.com.etechoracio.pw2_study.repository.ConexaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConexaoService {

    @Autowired
    private ConexaoRepository repository;



    public long contarConexoes(){
        return repository.count();

    }
}
