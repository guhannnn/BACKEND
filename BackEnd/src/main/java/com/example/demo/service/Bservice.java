package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Education;


@Service
public class Bservice {

	@Autowired
	com.example.demo.repository.Brepo repository;
//	public List<Education> getallusersname(String n){
//	return repository.getallusersname(n);
//	}
public String updateDetails(Education pro) {
		repository.save(pro);
		return "updated";
	}
public String deleteDetails(int Adid)
{
	repository.deleteById(Adid);
	return"Id deleted";
}
}
