/*
package com.certant.pokedex.services;

import com.certant.pokedex.entities.Pokemon;
import com.certant.pokedex.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public Set<Pokemon> getAllPokemons() {
        Set<Pokemon> pokemons = new HashSet<Pokemon>();
        pokemonRepository.findAll().forEach(pokemons::add);
        return pokemons;
    }

    public Pokemon getPokemonByName(String name) {
        return pokemonRepository.findByName(name).get(0);
    }

}
*/
