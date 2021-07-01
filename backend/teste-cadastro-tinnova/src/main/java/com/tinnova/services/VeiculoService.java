package com.tinnova.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tinnova.dto.VeiculoDTO;
import com.tinnova.dto.VeiculoPorDecadaDTO;
import com.tinnova.dto.VeiculoPorMarcaDTO;
import com.tinnova.dto.VeiculosNaoVendidosDTO;
import com.tinnova.entities.Veiculo;
import com.tinnova.repositories.VeiculoRepository;
import com.tinnova.services.exceptions.DatabaseException;
import com.tinnova.services.exceptions.ResourceNotFoundException;

@Service
public class VeiculoService {

	@Autowired
	public VeiculoRepository repository;

	@Transactional(readOnly = true)
	public Page<VeiculoDTO> findAll(Pageable pageable) {
		Page<Veiculo> result = repository.findAll(pageable);
		return result.map(x -> new VeiculoDTO(x));
	}

	@Transactional(readOnly = true)
	public VeiculoDTO findById(Long id) {
		Optional<Veiculo> obj = repository.findById(id);
		Veiculo entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new VeiculoDTO(entity);
	}

	//
	@Transactional(readOnly = true)
	public VeiculosNaoVendidosDTO veiculosNaoVendidos() {
		return repository.countByVendidoFalse();
	}

	@Transactional(readOnly = true)
	public List<VeiculoPorMarcaDTO> veiculosPorMarca() {
		return repository.veiculoPorMarca();
	}

	@Transactional(readOnly = true)
	public List<VeiculoPorDecadaDTO> veiculosPorDecada() {
		return repository.veiculoPorDecada();
	}

	//
	@Transactional
	public VeiculoDTO insert(VeiculoDTO dto) {
		Veiculo entity = new Veiculo();
		entity.setVeiculo(dto.getVeiculo());
		entity.setMarca(dto.getMarca());
		entity.setAno(dto.getAno());
		entity.setDescricao(dto.getDescricao());
		entity.setVendido(dto.getVendido());
		entity.setCreated(dto.getCreated());
		entity.setUpdated(dto.getUpdated());
		entity = repository.save(entity);
		return new VeiculoDTO(entity);
	}

	@Transactional
	public VeiculoDTO update(Long id, VeiculoDTO dto) {
		try {
			
			Veiculo entity = repository.getById(id);
			entity.setVeiculo(dto.getVeiculo());
			entity.setMarca(dto.getMarca());
			entity.setAno(dto.getAno());
			entity.setDescricao(dto.getDescricao());
			entity.setVendido(dto.getVendido());
			entity.setCreated(dto.getCreated());
			entity.setUpdated(dto.getUpdated());
			entity = repository.save(entity);
			return new VeiculoDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}

	}

}
