package br.gov.bom.retiro.catalogo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.catalogo.controller.dto.ServicoDTO;

@Service
public class ServicoService {
	
	public ServicoDTO find(Long id) {
		return DataUtil.servicos.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
	}

	public List<ServicoDTO> listarPorOrgao(Long orgaoId) {
		return DataUtil.servicos.stream()
						.filter(i -> i.getOrgao().getId().equals(orgaoId))
						.collect(Collectors.toList());
	}
	
}
