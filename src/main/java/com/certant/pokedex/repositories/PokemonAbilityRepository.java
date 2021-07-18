package com.certant.pokedex.repositories;

        import java.util.List;

        import com.certant.pokedex.entities.PokemonAbility;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "abilities", path = "abilities")
public interface PokemonAbilityRepository extends PagingAndSortingRepository<PokemonAbility, Long> {

    List<PokemonAbility> findByName(@Param("name") String name);

}