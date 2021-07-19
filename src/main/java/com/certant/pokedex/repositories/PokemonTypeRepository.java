package com.certant.pokedex.repositories;

        import java.util.List;

        import com.certant.pokedex.entities.Type;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.repository.query.Param;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface PokemonTypeRepository extends PagingAndSortingRepository<Type, Long> {

    List<Type> findByName(@Param("name") String name);

}