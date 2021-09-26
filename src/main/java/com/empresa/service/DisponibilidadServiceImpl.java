package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Disponibilidad;
import com.empresa.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository disponibilidadRepository;
	
	
	
	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		// TODO Auto-generated method stub
		return disponibilidadRepository.findAll();
	}



	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		// TODO Auto-generated method stub
		return disponibilidadRepository.save(obj);
	}

}
