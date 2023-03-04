package org.pe.prefeitura.recife.provaprefeitura.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.pe.prefeitura.recife.provaprefeitura.repositories.PessoasRepository;
import org.pe.prefeitura.recife.provaprefeitura.entities.Pessoas;

@Service
public class PessoasService {
     
    @Autowired
    private PessoasRepository pessoasRepository;

    public Pessoas novaPessoa(Pessoas pessoas){
        pessoasRepository.save(pessoas);
        pessoas.setId_pessoa(pessoas.getId_pessoa());
        pessoas.setRefNovaPessoa(pessoas.getRefNovaPessoa());
        return pessoas;
    }
    
    public Page<Pessoas> procurarTodasAsPessoas(Pageable pageable){
		
		return pessoasRepository.findAll(pageable);
		
	}
}
