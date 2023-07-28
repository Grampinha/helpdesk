package com.grampinha.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampinha.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
