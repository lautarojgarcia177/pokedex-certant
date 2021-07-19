package com.certant.pokedex;

import com.certant.pokedex.repositories.PokemonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PokedexApplicationTests {

	@Autowired
	private PokemonRepository pokemonRepository;

	@Test
	void contextLoads() throws Exception {
		assertThat(pokemonRepository).isNotNull();
	}

}
