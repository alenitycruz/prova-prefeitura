package org.pe.prefeitura.recife.provaprefeitura.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_PESSOAS")
public class Pessoas implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pessoa;
    private Pessoas refNovaPessoa;

    public Pessoas(){}

    public Pessoas(Long id_pessoa){
        this.refNovaPessoa = null;
        this.id_pessoa = id_pessoa;
    }

}
