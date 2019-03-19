package org.br.springalura.service;

import org.br.springalura.model.Convidado;
import org.springframework.stereotype.Service;

public interface ConvidadoService {
	
	public Iterable<Convidado> findAll(); 
	public void save(Convidado convidado);

}
