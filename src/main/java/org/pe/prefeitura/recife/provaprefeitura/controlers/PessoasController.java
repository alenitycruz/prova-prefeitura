package org.pe.prefeitura.recife.provaprefeitura.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.pe.prefeitura.recife.provaprefeitura.services.PessoasService;
import org.pe.prefeitura.recife.provaprefeitura.dtos.PessoasDTO;

@RestController
@RequestMapping("/v1/pessoas")
public class PessoasController {
    
    @Autowired
    private PessoasService pessoasService;

    @GetMapping
    public ResponseEntity<Page<PessoasDTO>> buscarTodasAsPessoas(@PageableDefault Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(pessoasService.procurarTodasAsPessoas(pageable));
    }


    @PostMapping
	public ResponseEntity<PessoasDTO> salvarPessoa(@RequestBody PessoasDTO dto) throws Exception {
     Pessoas pessoas = pessoasService.novaPessoa(dto);

		return ResponseEntity.ok(dto);
	}


}
