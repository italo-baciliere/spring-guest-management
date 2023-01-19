package br.com.festa.gestao.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long>{
        
}