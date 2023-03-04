package org.pe.prefeitura.recife.provaprefeitura.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.pe.prefeitura.recife.provaprefeitura.services.SenhaService;

@RestController
@RequestMapping("/v1/senhas")
public class SenhaController {
    @Autowired
    private SenhaService senhaService;

    @GetMapping
    public ResponseEntity<PageSenhaDTO>> buscarTodasAsSenhas(@PageableDefault Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(senhaService.procurarTodasAsSenhas(pageable));
    }


    @PostMapping
	public ResponseEntity<SenhaDTO> salvarSenha(@RequestBody SenhaDTO dto) throws Exception {
     Senha senha = senhaService.novaSenha(dto);

		return ResponseEntity.ok(dto);
	}

}
