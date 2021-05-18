package net.maromo.exemplometodos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List lista = new ArrayList();
	    lista.add("Maromo");
	    lista.add((int)333);
	    lista.add(3);
	    lista.add("Maromo");
	    lista.add(System.currentTimeMillis());
	    lista.add(333.33);
	    //Quantos elementos tem na lista
        System.out.println("Lista tem: " + lista.size());
		//Iterar 1
        for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
        //Iterar 2
		for (Object x : lista) {
			System.out.println(x);
		}
		//Iterar 3
		Iterator iterator = (Iterator) lista.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		lista.add(5555);
		System.out.println("Lista tem: " + lista.size());

		while (lista.contains("Maromo") ){
			lista.remove("Maromo");
		}

		System.out.println("Lista tem: " + lista.size());
		iterator = (Iterator) lista.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

		List lista2 = new ArrayList();
		lista2.add("To na 2");
		lista2.add("To na 2 também");

		lista2.addAll(lista);
		System.out.println("Lista 2 agora");
		for (Object x: lista2) {
			System.out.println(x);
		}

		lista2.clear();
		System.out.println("Lista tem: " + lista2.size() +" elementos");
    }
}
