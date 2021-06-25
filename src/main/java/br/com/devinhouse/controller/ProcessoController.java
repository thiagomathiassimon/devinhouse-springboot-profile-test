package br.com.devinhouse.controller;
import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.devinhouse.dto.ProcessoDTO;
import br.com.devinhouse.service.ProcessoService;

@RestController
@RequestMapping(value = "/v1/processo")
public class ProcessoController {
	
	@Autowired
	private ProcessoService service;
	
	  @ResponseStatus(code = CREATED)
	  @PostMapping
	  public ProcessoDTO criaProcesso(@RequestBody ProcessoDTO dto) {
	    return service.salvarProcesso(dto);
	  }
	

}
