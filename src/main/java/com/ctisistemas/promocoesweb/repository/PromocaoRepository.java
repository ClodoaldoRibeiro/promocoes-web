package com.ctisistemas.promocoesweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctisistemas.promocoesweb.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {

}
