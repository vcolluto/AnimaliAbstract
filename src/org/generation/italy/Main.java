package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.Animale;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		/*		
		Animale a=new Animale("Pippo",2);		//non si può creare un'istanza di una classe astratta, perché è una classe "incompleta": cosa succederebbe se fosse possibile chiamare il faiVerso()?

		a.faiVerso();//cosa faccio?
		*/
		
		
		Cane c=new Cane("Bobby", 3);	//posso creare un'istanza di Cane perché ho implementato il metodo astratto
		System.out.println(c.toString());
		c.faiVerso();			//è definito nella sottoclasse		
		c.dormi();				//è definito nella superclasse
		
		System.out.println("\n");
		Gatto g=new Gatto("Felix",2);	
		System.out.println(g.toString());
		g.faiVerso();
		g.dormi();
	
		
		ArrayList<Animale> elencoAnimali=new ArrayList<Animale>();		//elenco di generici animali
		
		elencoAnimali.add(g);		//polimorfismo: l'animale è un gatto
		elencoAnimali.add(c);		//polimorfismo: l'animale è un cane
		elencoAnimali.add(new Cane("Leone",4));
		elencoAnimali.add(new Gatto("Nerina",1));
		
		
		System.out.println("\n\nVERSI DEGLI ANIMALI NELL'ELENCO:");
		for(Animale anim:elencoAnimali) {
			anim.faiVerso();
			anim.dormi();  		//l'implementazione del metodo è la stessa per tutti gli animali (esce sempre lo stesso messaggio)
			System.out.println();
		}
	}

}
