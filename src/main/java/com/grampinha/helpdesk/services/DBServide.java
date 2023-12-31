package com.grampinha.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampinha.helpdesk.domain.Chamado;
import com.grampinha.helpdesk.domain.Cliente;
import com.grampinha.helpdesk.domain.Tecnico;
import com.grampinha.helpdesk.domain.enums.Perfil;
import com.grampinha.helpdesk.domain.enums.Prioridade;
import com.grampinha.helpdesk.domain.enums.Status;
import com.grampinha.helpdesk.repositories.ChamadoRepository;
import com.grampinha.helpdesk.repositories.ClienteRepository;
import com.grampinha.helpdesk.repositories.TecnicoRepository;

@Service
public class DBServide {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;	

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Anderson Grampinha", "550.482.150-95", "anderson@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Stallman", "903.347.070-56", "stallman@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "271.068.470-54", "shannon@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "162.720.120-39", "lee@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "778.556.170-27", "linus@mail.com", "123");

		Cliente cli1 = new Cliente(null, "Albert Einstein", "111.661.890-74", "einstein@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Marie Curie", "322.429.140-06", "curie@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Charles Darwin", "792.043.830-62", "darwin@mail.com", "123");
		Cliente cli4 = new Cliente(null, "Stephen Hawking", "177.409.680-30", "hawking@mail.com", "123");
		Cliente cli5 = new Cliente(null, "Max Planck", "081.399.300-83", "planck@mail.com", "123");

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.EMANDAMENTO, "Chamado 1", "Teste chamado 1", tec1, cli1);
		Chamado cha2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
		Chamado cha3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
		Chamado cha4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
		Chamado cha5 = new Chamado(null, Prioridade.MEDIA, Status.EMANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
		Chamado cha6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 7", "Teste chamado 6", tec1, cli5);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		tecnicoRepository.saveAll(Arrays.asList(tec4));
		tecnicoRepository.saveAll(Arrays.asList(tec5));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		clienteRepository.saveAll(Arrays.asList(cli2));
		clienteRepository.saveAll(Arrays.asList(cli3));
		clienteRepository.saveAll(Arrays.asList(cli4));
		clienteRepository.saveAll(Arrays.asList(cli5));
		
		chamadoRepository.saveAll(Arrays.asList(cha1));
		chamadoRepository.saveAll(Arrays.asList(cha2));
		chamadoRepository.saveAll(Arrays.asList(cha3));
		chamadoRepository.saveAll(Arrays.asList(cha4));
		chamadoRepository.saveAll(Arrays.asList(cha5));
		chamadoRepository.saveAll(Arrays.asList(cha6));
	}
}
