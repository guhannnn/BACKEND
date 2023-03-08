package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Education;

@Repository
public interface Brepo extends JpaRepository<Education,Integer>{
	
//	@Query("select u from employee u where u.name=:a")
//	public List<Education>getallusersname(@Param("a")String name);
}
