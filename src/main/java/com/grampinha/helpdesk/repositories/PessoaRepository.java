package com.grampinha.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampinha.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
