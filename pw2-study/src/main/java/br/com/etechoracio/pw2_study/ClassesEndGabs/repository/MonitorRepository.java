package br.com.etechoracio.pw2_study.repository;

import br.com.etechoracio.pw2_study.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
