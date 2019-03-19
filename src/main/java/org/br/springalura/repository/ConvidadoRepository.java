package org.br.springalura.repository;

import org.br.springalura.model.Convidado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConvidadoRepository extends MongoRepository<Convidado, String>{

}
