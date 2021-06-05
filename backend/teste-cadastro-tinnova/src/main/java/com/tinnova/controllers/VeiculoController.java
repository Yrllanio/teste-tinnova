package com.tinnova.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tinnova.dto.VeiculoDTO;
import com.tinnova.dto.VeiculoPorDecadaDTO;
import com.tinnova.dto.VeiculoPorMarcaDTO;
import com.tinnova.dto.VeiculosNaoVendidosDTO;
import com.tinnova.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService service;
	
	@GetMapping
	public ResponseEntity<Page<VeiculoDTO>> findAll(Pageable pageable){
		Page<VeiculoDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> findById(@PathVariable Long id) {
		VeiculoDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	//
	@GetMapping(value = "/nao-vendidos")
	public ResponseEntity<VeiculosNaoVendidosDTO> veiculosNaoVendidos() {		
		VeiculosNaoVendidosDTO quantity = service.veiculosNaoVendidos();
		return ResponseEntity.ok(quantity);
	}
	
	@GetMapping(value = "/veiculos-por-marca")
	public ResponseEntity<List<VeiculoPorMarcaDTO>> veiculosPorMarca() {		
		List<VeiculoPorMarcaDTO> quantity = service.veiculosPorMarca();
		return ResponseEntity.ok(quantity);
	}
	
	@GetMapping(value = "/veiculos-por-decada")
	public ResponseEntity<List<VeiculoPorDecadaDTO>> veiculosPorDecada() {		
		List<VeiculoPorDecadaDTO> quantity = service.veiculosPorDecada();
		return ResponseEntity.ok(quantity);
	}	
	//
	@PostMapping
	public ResponseEntity<VeiculoDTO> insert(@RequestBody VeiculoDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> update(@PathVariable Long id, @RequestBody VeiculoDTO dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
