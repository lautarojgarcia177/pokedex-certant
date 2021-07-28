package com.certant.pokedex.repositories;

        import java.util.List;

        import com.certant.pokedex.entities.Ability;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource(collectionResourceRel = "abilities", path = "abilities")
public interface AbilityRepository extends PagingAndSortingRepository<Ability, Long> {

    List<Ability> findByName(@Param("name") String name);

}