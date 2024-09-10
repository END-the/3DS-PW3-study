package br.com.etechoracio.pw2_study.repository;

import br.com.etechoracio.pw2_study.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
