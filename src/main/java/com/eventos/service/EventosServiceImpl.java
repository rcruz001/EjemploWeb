package com.eventos.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.dao.EventosDAO;
import com.eventos.entities.Eventos;

@Service
public class EventosServiceImpl implements EventosService {

	@Autowired
	private EventosDAO eventosDAO;
	
	
	@Override
	public List<Eventos> findAll() {
		// TODO Auto-generated method stub
		return eventosDAO.findAll();
	}

	@Override
	public Eventos findOne(int id) {
		// TODO Auto-generated method stub
		return eventosDAO.findOne(id);
	}
	
	@Override
	public void add(String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar) {
		// TODO Auto-generated method stub
		Eventos evento = new Eventos();
		evento.setNombre(nombre);
		evento.setFechaInicio(fechaInicio);
		evento.setFechaFin(fechaFin);
		evento.setAsunto(asunto);
		evento.setLugar(lugar);

		eventosDAO.add(evento);
	}

	@Override
	public void up(int id, String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar) {
		// TODO Auto-generated method stub
		Eventos evento = eventosDAO.findOne(id);
		evento.setNombre(nombre);
		evento.setFechaInicio(fechaInicio);
		evento.setFechaFin(fechaFin);
		evento.setAsunto(asunto);
		evento.setLugar(lugar);
		eventosDAO.add(evento);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		eventosDAO.del(id);
	}

	@Override
	public List<Eventos> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return eventosDAO.findAll(busqueda);
	}

	

}
