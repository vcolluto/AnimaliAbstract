package org.generation.italy.model;

public class Cane extends Animale {

	
	public Cane(String nome, int età) {
		super(nome, età);		
	}

	//Adesso lo posso dire come fare il verso, perché so che è un cane!
	//questo metodo sovrascrive il metodo generico che ho sulla superclasse
	@Override
	public void faiVerso() {
		System.out.println("BAU!");
	}

	@Override
	public String toString() {
		return "Cane [nome=" + nome + ", età=" + età + "]";
	}
}
