package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ifce.br.model.Time;
import com.ifce.br.repository.TimeRepository;

@Service
public class TimeService {

	
	@Autowired
	private TimeRepository tr;
	
	public void cadastrarTime(Time time) {
		tr.save(time);
	}
	
	public List<Time> listarTime() {
		return tr.findAll();
	}

	public void excluirTime(Long id) {
			tr.deleteById(id);
		}
}

