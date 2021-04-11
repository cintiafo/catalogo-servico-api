package br.gov.bom.retiro.catalogo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.bom.retiro.catalogo.controller.dto.OrgaoMunicipalDTO;
import br.gov.bom.retiro.catalogo.service.OrgaoMunicipalService;

@RestController
@RequestMapping(path = "/orgaosmunicipais", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class OrgaoMunicipalController {
	
	private OrgaoMunicipalService service;
	
	public OrgaoMunicipalController(OrgaoMunicipalService service){
		this.service = service;
	}
	
	@GetMapping
    public ResponseEntity<List<OrgaoMunicipalDTO>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }
	
}
