package org.generation.italy.model;

public class Gatto extends Animale {

	public Gatto(String nome, int età) {
		super(nome, età);		
	}

	@Override
	public void faiVerso() {
		System.out.println("MIAO!");
	}

	
	@Override
	public String toString() {
		return "Gatto [nome=" + nome + ", età=" + età + "]";
	}
}
