package br.gov.bom.retiro.catalogo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.gov.bom.retiro.catalogo.controller.dto.OrgaoMunicipalDTO;
import br.gov.bom.retiro.catalogo.controller.dto.ServicoDTO;

public class DataUtil {
	
	public static List<OrgaoMunicipalDTO> orgaos;
	public static List<ServicoDTO> servicos;
	
	static {
		Map<String, List<String>> mapaServicos = new HashMap<>();
		mapaServicos.put("Secretaria Municipal de Educação", Arrays.asList("Matricula de aluno","Solicitar Transferência de aluno","Inscrição para seminário"));
		mapaServicos.put("Secretaria Municipal de Saúde", Arrays.asList("Imunização","Marcação de Cirurgia","Marcação de Exames", "Marcação de consultas Médico da Família", "Marcação de consultas Especialista"));
		mapaServicos.put("Secretaria Municipal de Fazenda", Arrays.asList("Acompanhamento Processos","Consultar Dívida Ativa"));
		mapaServicos.put("Secretaria Municipal de Transporte", Arrays.asList("Consulta Linhas Municipais","Multas de Trânsito","Agendar vistoria transporte escolar"));
		
		orgaos = new ArrayList<>();
		servicos = new ArrayList<>();
		
		long idOrgao = 1L;
		long idServico = 1L;
		
		for (Entry<String, List<String>> entry: mapaServicos.entrySet()) {
			OrgaoMunicipalDTO orgao = OrgaoMunicipalDTO.builder().id(idOrgao++).nome(entry.getKey()).build();
			
			orgaos.add(orgao);
			
			for (String servico : entry.getValue()) {
				servicos.add(ServicoDTO.builder().id(idServico++).nome(servico).orgao(orgao).build());
			}
			
		}
		
	}
	
}

