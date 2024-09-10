package br.com.etechoracio.pw2_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="TBL_DISPONIBILIDADE")
public class Disponibilidade {

    @Id
    @Column(name="ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TX_DIA_SEMANA")
    private String dia;

    @Column(name="DT_DAS")
    private LocalDateTime das;

    @Column(name="DT_ATE")
    private LocalDateTime ate;

}
