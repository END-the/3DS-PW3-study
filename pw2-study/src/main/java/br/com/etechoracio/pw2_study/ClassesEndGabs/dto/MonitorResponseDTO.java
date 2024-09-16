package br.com.etechoracio.pw2_study.dto;

import br.com.etechoracio.pw2_study.entity.Disciplina;
import br.com.etechoracio.pw2_study.entity.Disponibilidade;
import lombok.Data;

import java.util.List;

@Data
public class MonitorResponseDTO {
    private String nome;
    private String foto;
    private Disciplina disciplina;
    private List<Disponibilidade> disponibilidades;
}
