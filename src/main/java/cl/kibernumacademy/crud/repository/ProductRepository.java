package cl.kibernumacademy.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.kibernumacademy.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
