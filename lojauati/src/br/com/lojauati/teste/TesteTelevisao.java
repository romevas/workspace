package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao objeto = new Televisao();
		
		System.out.println(objeto.exibirTudo());
		
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.mudarCanal(5);
	
		System.out.println("========================");
		System.out.println(objeto.exibirTudo());

		objeto.ligar();
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.mudarCanal(5);
	
		System.out.println("========================");
		System.out.println(objeto.exibirTudo());

		objeto.aumentarVolume();
		objeto.aumentarVolume();
		objeto.mudarCanal(7);
	
		System.out.println("========================");
		System.out.println(objeto.exibirTudo());

		objeto.diminuirVolume();
		objeto.mudarCanal(7);
	
		System.out.println("========================");
		System.out.println(objeto.exibirTudo());
		
	}

}
