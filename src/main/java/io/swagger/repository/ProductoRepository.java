package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.model.Producto_db;

@Repository
public interface ProductoRepository extends JpaRepository<Producto_db, Integer>{

}
