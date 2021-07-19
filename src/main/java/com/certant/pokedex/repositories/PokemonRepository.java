package com.certant.pokedex.repositories;

import java.util.List;

import com.certant.pokedex.entities.Pokemon;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long> {

    List<Pokemon> findByName(@Param("name") String name);

}