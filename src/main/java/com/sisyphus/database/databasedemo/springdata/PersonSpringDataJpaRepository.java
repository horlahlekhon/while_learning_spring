package com.sisyphus.database.databasedemo.springdata;

import com.sisyphus.database.databasedemo.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataJpaRepository extends JpaRepository<Person, Integer>{

    
}