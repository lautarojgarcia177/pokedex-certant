package com.certant.pokedex.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POKEMON_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IMG")
    private String img;

    @Column(name = "FOUND_ON_LEVEL")
    private short foundOnLevel;

    @Column(name = "EVOLUTION_ON_LEVEL")
    private short evolutionOnLevel;

    @ManyToMany(targetEntity=PokemonAbility.class, cascade = {CascadeType.ALL})
    @JoinTable(name="POKEMONS_ABILITIES", joinColumns = { @JoinColumn(name="POKEMON_ID") }, inverseJoinColumns = { @JoinColumn(name="ABILITY_ID")})
    private Set<PokemonAbility> abilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public short getFoundOnLevel() {
        return foundOnLevel;
    }

    public void setFoundOnLevel(short foundOnLevel) {
        this.foundOnLevel = foundOnLevel;
    }

    public short getEvolutionOnLevel() {
        return evolutionOnLevel;
    }

    public void setEvolutionOnLevel(short evolutionOnLevel) {
        this.evolutionOnLevel = evolutionOnLevel;
    }


}