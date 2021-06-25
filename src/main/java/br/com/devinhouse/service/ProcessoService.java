package br.com.devinhouse.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devinhouse.dto.ProcessoDTO;
import br.com.devinhouse.repository.ProcessoRepository;

@Service
public class ProcessoService {

	private static final Logger logger = LoggerFactory.getLogger(ProcessoService.class);

	@Autowired
	ProcessoRepository repository;

	public ProcessoDTO salvarProcesso(ProcessoDTO dto) {

		validarCadastroProcesso(dto);

		return null;
	}

	private void validarCadastroProcesso(ProcessoDTO dto) {

//		1 - Não poderá ser cadastrado um novo processo com um id já existente;
//		2 - Não poderá ser cadastrado um novo processo com uma chave de processo já existente;
//		3 - Não poderá ser cadastrado um novo processo com interessados inativos;
//		4 - Não poderá ser cadastrado um novo processo com assuntos inativos;
//		5 - Não poderá ser cadastrado um novo processo com interessados inesistentes no sistema;
//		6 - Não poderá ser cadastrado um novo processo com assuntos inesistentes no sistema;
//		7 - Não poderá ser cadastrado um novo interessado com um id já existente;
//		8 - Não poderá ser cadastrado um novo interessado com um mesmo documento de indentificação;
//		9 - Não poderá ser cadastrado um novo interessado com um documento de identificação inválido;
//		10 - A formatação da chave do processo deve seguir a seguinte mascara SGORGAOSETOR NUPROCESSO/NUANO ex: SOFT 1/2021;

		// lançar eseção especifica

		// throw new
	}

}
