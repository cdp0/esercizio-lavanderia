package com.esercizi.java.lavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esercizi.java.lavanderia.entity.Gruccia;

@Repository
public interface RepositoryGruccia extends JpaRepository <Gruccia, Long>  {

}
