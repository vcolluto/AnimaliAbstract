package org.generation.italy.model;

//classe astratta: contiene dei metodi non implementati 
//(cioè senza la definizione del blocco di codice da eseguire).
//Saranno le sottoclassi a implementare i metodi astratti
public abstract class Animale {		 
	protected String nome;
	protected int età;
	
	public String getNome() {
		return nome;
	}
	public int getEtà() {
		return età;
	}
	
	public Animale(String nome, int età) {
		super();
		this.nome = nome;
		this.età = età;
	}
	
	
	public void dormi() {
		System.out.println("ZZZZZ");
	}
		
	
	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", età=" + età + "]";
	}
	
	
	//ogni animale fa un verso, ma il modo con cui lo fa dipende dal tipo di animale (sottoclasse)
	//metodo astratto: non è presente la definizione del blocco di codice da eseguire
	//Saranno le sottoclassi di Animale a implementare il metodo
	//Quando si definisce un metodo astratto, si obbligano le sottoclassi a fornire l'implementazione del metodo
	public abstract void faiVerso(); 	

}
