package com.ctisistemas.promocoesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctisistemas.promocoesweb.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
