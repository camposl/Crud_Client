package com.lucas.devsuperior.desafio_crud.repositories;

import com.lucas.devsuperior.desafio_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
