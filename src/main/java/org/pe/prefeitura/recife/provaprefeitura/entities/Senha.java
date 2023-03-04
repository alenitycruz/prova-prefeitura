package org.pe.prefeitura.recife.provaprefeitura.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import jakarta.persistence.OneToMany;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_SENHA")
public class Senha implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_senha;

    @OneToMany
    private Pessoas refNovaSenhaPessoa;

    public Senha(){
        this.refNovaSenhaPessoa = null;
    }

    public Senha(Pessoas refNovaSenhaPessoa){
        this.refNovaSenhaPessoa = refNovaSenhaPessoa;
    }

    public boolean isEmpty() {
        return this.refNovaSenhaPessoa == null ? true : false;
    }

    public void enqueue(Pessoas novaSenha){
        novaSenha.setRefNovaPessoa(refNovaSenhaPessoa);
        refNovaSenhaPessoa = novaSenha;
    }

    
}

