package br.com.web.projetoweb.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.web.projetoweb.models.Convidado;

public interface  ConvidadoRepository extends  CrudRepository<Convidado, String> {
    
}
