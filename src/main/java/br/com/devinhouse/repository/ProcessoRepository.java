package br.com.devinhouse.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devinhouse.model.Processo;

public interface ProcessoRepository extends JpaRepository<Processo, Long> {
	
	Optional<Processo> findByChaveProcesso(String chaveProcesso);

	List<Processo> findByCdAssunto(Long cdAssunto);

	List<Processo> findByCdInteressado(Long cdInteressado);

	Optional<Processo> findByNuProcesso(Integer nuProcesso);

	Boolean existsByNuProcesso(Long nuProcesso);
	
	Boolean existsByChaveProcesso(String chaveProcesso);
}
