package com.certant.pokedex.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POKEMON_ID")
    private long id;

    @Column(name = "NAME", unique = true)
    private String name;

    @Column(name = "IMG")
    private String img;

    @Column(name = "FOUND_ON_LEVEL")
    private short foundOnLevel;

    @Column(name = "EVOLUTION_ON_LEVEL")
    private short evolutionOnLevel;

    @ManyToMany(targetEntity= Ability.class, cascade = {CascadeType.ALL})
    @JoinTable(name="POKEMONS_ABILITIES", joinColumns = { @JoinColumn(name="PA_POKEMON_ID") }, inverseJoinColumns = { @JoinColumn(name="PA_ABILITY_ID")})
    private Set<Ability> abilities;

    @ManyToMany(targetEntity = Type.class, cascade = { CascadeType.ALL })
    @JoinTable(name="POKEMONS_TYPES",
            joinColumns = { @JoinColumn(name="PT_POKEMON_ID")},
            inverseJoinColumns = { @JoinColumn(name="PT_TYPE_ID")}
    )
    private Set<Type> types;

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

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }

    public Set<Type> getTypes() {
        return types;
    }

    public void setTypes(Set<Type> types) {
        this.types = types;
    }

}