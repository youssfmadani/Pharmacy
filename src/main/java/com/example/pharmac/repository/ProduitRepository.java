package com.example.pharmac.repository;

import com.example.pharmac.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
