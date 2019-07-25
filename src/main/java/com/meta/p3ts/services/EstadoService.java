package com.meta.p3ts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meta.p3ts.domain.Estado;
import com.meta.p3ts.repositories.EstadoRepository;

@Service
public class EstadoService { 
	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}