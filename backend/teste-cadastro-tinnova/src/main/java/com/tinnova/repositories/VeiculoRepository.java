package com.tinnova.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tinnova.dto.VeiculoPorDecadaDTO;
import com.tinnova.dto.VeiculoPorMarcaDTO;
import com.tinnova.dto.VeiculosNaoVendidosDTO;
import com.tinnova.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	VeiculosNaoVendidosDTO countByVendidoFalse();

	@Query("SELECT new com.tinnova.dto.VeiculoPorMarcaDTO(obj.marca, COUNT(obj.marca)) "
			+ " FROM Veiculo AS obj GROUP BY obj.marca")
	List<VeiculoPorMarcaDTO> veiculoPorMarca();

	@Query("SELECT DISTINCT new com.tinnova.dto.VeiculoPorDecadaDTO(obj.ano/10*10, COUNT(obj.ano)) "
			+ " FROM Veiculo AS obj GROUP BY obj.ano/10*10")
	List<VeiculoPorDecadaDTO> veiculoPorDecada();
}
