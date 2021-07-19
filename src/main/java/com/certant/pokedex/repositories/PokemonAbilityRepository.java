package com.certant.pokedex.repositories;

        import java.util.List;

        import com.certant.pokedex.entities.Ability;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "abilities", path = "abilities")
public interface PokemonAbilityRepository extends PagingAndSortingRepository<Ability, Long> {

    List<Ability> findByName(@Param("name") String name);

}