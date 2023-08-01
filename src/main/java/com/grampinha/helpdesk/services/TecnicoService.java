package com.grampinha.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampinha.helpdesk.domain.Tecnico;
import com.grampinha.helpdesk.domain.dtos.TecnicoDTO;
import com.grampinha.helpdesk.repositories.TecnicoRepository;
import com.grampinha.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico findById(Integer id) {

		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));

	}

	public List<Tecnico> findAll() {
		return repository.findAll();

	}

	public Tecnico create(TecnicoDTO objDTO) {
		objDTO.setId(null);
		Tecnico newObj = new Tecnico(objDTO);
		return repository.save(newObj);

	}
}
