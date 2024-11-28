package com.bancolombia.app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bancolombia.app.entities.Item;

import com.bancolombia.app.datasource.ItemRepository;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private ItemRepository repositorio;

	@Override
	public boolean insert(Item item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Item> getALL() {
		return repositorio.getALL();
	}
	
	

}
