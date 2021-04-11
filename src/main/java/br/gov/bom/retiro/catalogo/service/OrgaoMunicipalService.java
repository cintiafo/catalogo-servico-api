package br.gov.bom.retiro.catalogo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.catalogo.controller.dto.OrgaoMunicipalDTO;

@Service
public class OrgaoMunicipalService {
	
	
	public List<OrgaoMunicipalDTO> findAll() {
		return DataUtil.orgaos;
	}
	
}
