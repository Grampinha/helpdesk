package com.grampinha.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampinha.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
