package org.pe.prefeitura.recife.provaprefeitura.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.pe.prefeitura.recife.provaprefeitura.entities.Senha;

@Repository
public interface SenhaRepository extends JpaRepository<Senha, Long>{
    Page<Senha> findAll(Pageable pageable);
}
