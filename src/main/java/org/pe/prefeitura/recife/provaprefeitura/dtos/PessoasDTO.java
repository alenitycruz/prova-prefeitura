package org.pe.prefeitura.recife.provaprefeitura.dtos;

import lombok.Data;

import org.pe.prefeitura.recife.provaprefeitura.entities.Pessoas;

@Data
public class PessoasDTO {
    
    private Long id_pessoa;
    private Pessoas refNovaPessoa;
}
