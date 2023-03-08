package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Education;
import com.example.demo.repository.Brepo;
import com.example.demo.service.Bservice;
@RestController
@CrossOrigin
public class Bcontroller {
@Autowired		
 Brepo repository;
@Autowired
 Bservice service;

@GetMapping("/getvalues")
List<Education>getList()
{
	return repository.findAll();
	
}

@PostMapping("/post")
public 	Education create(@RequestBody Education pro) {
return repository.save(pro);
}

//@GetMapping("/getallusers/{bookname}")
//public List<Education> getalluserListname (@PathVariable String bookname){
//return service.getallusersname(bookname);
//}

@DeleteMapping("/proj/{Adid}")
public String delete(@PathVariable int Adid) {
return service.deleteDetails(Adid);
}

@PutMapping("/update")
public String update(@RequestBody Education stu) {
	 return service.updateDetails(stu);
}

}
