package com.certant.pokedex;

import com.certant.pokedex.repositories.AbilityRepository;
import com.certant.pokedex.repositories.PokemonRepository;
import com.certant.pokedex.repositories.TypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PokedexApplicationTests {

	@Autowired
	private PokemonRepository pokemonRepository;

	@Autowired
	private AbilityRepository abilityRepository;

	@Autowired
	private TypeRepository typeRepository;

	@Test
	void contextLoads() throws Exception {
		assertThat(pokemonRepository).isNotNull();
		assertThat(abilityRepository).isNotNull();
		assertThat(typeRepository).isNotNull();
	}

}
