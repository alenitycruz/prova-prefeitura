package org.pe.prefeitura.recife.provaprefeitura.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.pe.prefeitura.recife.provaprefeitura.entities.Pessoas;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long> {
    
    Page<Pessoas> findAll(Pageable pageable);
}
