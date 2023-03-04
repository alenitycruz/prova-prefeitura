package org.pe.prefeitura.recife.provaprefeitura.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.pe.prefeitura.recife.provaprefeitura.repositories.SenhaRepository;
import org.pe.prefeitura.recife.provaprefeitura.entities.Senha;

@Service
public class SenhaService {
    
    @Autowired
    private SenhaRepository senhaRepository;

    public Senha novaSenha(Senha senha) {
        senhaRepository.save(senha);
        senha.setId_senha(senha.getId_senha());
        senha.setRefNovaSenhaPessoa(senha.getRefNovaSenhaPessoa());
        senha.isEmpty();
        senha.enqueue(senha.getRefNovaSenhaPessoa());
        return senha;
    }

    public Page<Senha> procurarTodasAsSenhas(Pageable pageable){
		
		return senhaRepository.findAll(pageable);
		
	}
}
