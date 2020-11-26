package com.ctisistemas.promocoesweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ctisistemas.promocoesweb.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {


	@Query("select distinct p.site from Promocao p where p.site like %:site%")
	List<String> findSitesByTermo(@Param("site") String site);

	@Transactional(readOnly = false)
	@Modifying
	@Query("update Promocao p set p.likes = p.likes + 1 where p.id = :id")
	void updateSomarLikes(@Param("id") Long id);

	@Query("select p.likes from Promocao p where p.id = :id")
	int findLikesById(@Param("id") Long id);

}
