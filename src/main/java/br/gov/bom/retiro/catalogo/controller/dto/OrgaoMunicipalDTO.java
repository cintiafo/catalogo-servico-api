package br.gov.bom.retiro.catalogo.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrgaoMunicipalDTO {

	private Long id;
	private String nome;
}
