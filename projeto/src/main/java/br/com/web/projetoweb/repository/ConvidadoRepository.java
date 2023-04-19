package br.com.web.projetoweb.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.web.projetoweb.models.Convidado;
import br.com.web.projetoweb.models.Evento;

public interface  ConvidadoRepository extends  CrudRepository<Convidado, String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
    
}
