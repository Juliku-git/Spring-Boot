package com.utn.jfm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.jfm.beans.Pokemon;

@Repository
public interface PokemonDAO {

	public Pokemon buscarPokemon(String nombre);
	
	public void ingresarPokemon (Pokemon pokemon);
		
	public Pokemon comprarPokemon();
	
	public List<Pokemon> verPokemones();
}