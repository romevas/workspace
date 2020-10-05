package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		System.out.println("Segundo elemento da lista : " + lista.get(1));
		lista.remove(2);
		System.out.println("Lista apos eliminar o terceiro elemento " + lista);
		Collections.sort(lista);
		
		for (int x = 0; x < lista.size(); x++)
		{
			System.out.println("Elemento for      " + lista.get(x));
		}
		
		for (String linha : lista) {
			System.out.println("Elemento for each " + linha);			
		}

	}

}
