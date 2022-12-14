package com.generation.lojagames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.lojagames.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long>
{
	public List<Categorias> findAllByDescricaoContainingIgnoreCase (String descricao);
}
