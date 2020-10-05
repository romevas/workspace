package br.com.lojauati.teste;

import br.com.lojauati.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {

		Elevador objeto = new Elevador(10, 20, 0);
		
		System.out.println(objeto.exibirTudo());
		System.out.println("========================");
		
		objeto.entrar(5);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.sair(2);

		System.out.println("========================");
		System.out.println(objeto.exibirTudo());

		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();

		System.out.println("========================");
		System.out.println(objeto.exibirTudo());
		
		objeto.entrar(50);

		System.out.println("========================");
		System.out.println(objeto.exibirTudo());
		
	}

}
