package br.com.devinhouse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProcessoDTO {

	private Long id;
	private Long nuProcesso;
	private String sgOrgaoSetor;
	private String nuAno;
	private String chaveProcesso;
	private String descricao;
	private Long cdAssunto;
	private Long cdInteressado;

}
