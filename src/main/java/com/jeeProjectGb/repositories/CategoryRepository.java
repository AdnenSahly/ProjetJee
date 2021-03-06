package com.jeeProjectGb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeeProjectGb.entities.Categorie;


@Repository
public interface CategoryRepository extends JpaRepository<Categorie, Long> {
public Categorie findById(long id);
}
