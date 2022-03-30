package com.esercizi.java.lavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esercizi.java.lavanderia.entity.Lavanderia;

@Repository
public interface RepositoryLavanderia extends JpaRepository <Lavanderia, Long>  {

}
