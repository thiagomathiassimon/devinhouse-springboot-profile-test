package br.com.devinhouse.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "Processo")
public class Processo {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	@Column(nullable = false)
	private Long nuProcesso;
	@Column(length = 4, nullable = false)
	private String sgOrgaoSetor;
	@Column(length = 4, nullable = false)
	private String nuAno;
	@Column(length = 45, nullable = false)
	private String chaveProcesso;
	@Column(length = 250, nullable = false)
	private String descricao;
	@Column(nullable = false)
	private Long cdAssunto;
	@Column(nullable = false)
	private Long cdInteressado;

	@Builder(toBuilder = true)
	public Processo(Long nuProcesso, String sgOrgaoSetor, String nuAno, String descricao, Long cdAssunto,Long cdInteressado) {
		this.nuProcesso = nuProcesso;
		this.sgOrgaoSetor = sgOrgaoSetor;
		this.nuAno = nuAno;
		this.descricao = descricao;
		this.cdAssunto = cdAssunto;
		this.cdInteressado = cdInteressado;
		this.chaveProcesso = this.sgOrgaoSetor + " " + this.nuProcesso + "/" + this.nuAno;
	}

}
