package com.example.REST.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.REST.repository.Emp_manager_repository;
import com.example.REST.model.Emp_manager;


@RestController
public class Emp_manager_resource {

	@Autowired
	Emp_manager_repository e_m_r;
	
	@RequestMapping(value= "/Emp_manager")
	public List<Emp_manager> getAll()
	
	{
		return e_m_r.findAll();
	}
}
	
