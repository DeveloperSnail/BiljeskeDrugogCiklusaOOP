package kolekcije_IteratorSucelja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ZAŠTO KORISTIMO ITERATOR??? Evo zašto ˇˇˇ

public class SuceljeIterableBilj {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(5);
		lista.add("Jedna banana");
		lista.add("Dve kruške");
		lista.add("Tre lješnje");
		lista.add("Četiri krune");
		lista.add("Pet O_O");
		
		
		 
		Iterator<String> it = lista.iterator();
		
		// PRINTANJE CIJELE LISTE POMOĆU ITERATORA
		//...hasNext() - ima li sljedećeg elementa za iteriranje u kolekciji
		//...next() - prelazak na sljedeći element
		//...remove() - makni trenutni element
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		// RAZLOG ZAŠTO KORISTIMO ITERATOR
		//brisanjem elementa mijenja se indeks svakog elementa, zato for petlja ne funkcionira kako bi trebala
		//zato koristimo iterator, zato on ima remove
		for (int i=0; i<lista.size(); i++) {
			System.out.println("Brišem element:" + lista.get(i));
			lista.remove(i);
		}
		/*
			System.out.println("Ako se pojavi error, to znači da je promjena liste onemogučila starom iteratoru iteriranje trenutne ismjenjene liste:");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println();
		*/
		System.out.println(lista + "\n");
		
		//Evo dokraja izbrisana sa iteratorom
		lista.add(0, "Jedna banana");
		lista.add(2, "Tre lješnje");
		lista.add(4, "Pet O_O");
		
		it = lista.iterator();
		while(it.hasNext()) {
			System.out.println("Brišem: " + it.next());
			it.remove();
		}
		System.out.println(lista + ", ako piše [] onda je prazno.");
		
		/* Promijenili smo listu dok se iterirala, ali nije se pokazao error.
		 * 		-> to je zato šta iterator pamti staru listu (naspream izmjenama)
		 * 			te nastavlja pratit taj stari iteration iako je trenutna lista izmjenjena
		 * */
		
	}

}
