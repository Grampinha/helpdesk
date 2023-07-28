package com.grampinha.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampinha.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
