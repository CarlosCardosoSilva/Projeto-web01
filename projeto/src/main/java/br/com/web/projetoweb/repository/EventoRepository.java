package br.com.web.projetoweb.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.web.projetoweb.models.Evento;



public interface EventoRepository extends CrudRepository<Evento, String> {

    
    Evento findByCodigo(long codigo);
    
}
