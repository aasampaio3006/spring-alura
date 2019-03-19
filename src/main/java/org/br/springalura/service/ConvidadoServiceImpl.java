package org.br.springalura.service;

import org.br.springalura.model.Convidado;
import org.br.springalura.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConvidadoServiceImpl implements ConvidadoService{

	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> findAll() {		
		return repository.findAll();
	}

	public void save(Convidado convidado) {
		repository.save(convidado);
		
	}

}
