package br.gov.bom.retiro.catalogo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.bom.retiro.catalogo.controller.dto.ServicoDTO;
import br.gov.bom.retiro.catalogo.service.ServicoService;

@RestController
@RequestMapping(path = "/servicos", produces=MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class ServicoController {
	
	private ServicoService service;
	
	public ServicoController(ServicoService service){
		this.service = service;
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<ServicoDTO> get(@PathVariable(required = true) Long id) {
        return ResponseEntity.ok(service.find(id));
    }
	
	@GetMapping("/listarPorOrgao")
    public ResponseEntity<List<ServicoDTO>> listarPorOrgao(@RequestParam(required = true) Long orgaoId){
		return new ResponseEntity<List<ServicoDTO>>(service.listarPorOrgao(orgaoId), HttpStatus.OK);
    }
	

}
