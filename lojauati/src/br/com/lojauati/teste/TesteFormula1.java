package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		
		Formula1 carro = new Formula1();
		
		//carro.preencherEscuderia(JOptionPane.showInputDialog("Preencha a Escuderia"));
		//carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Preencha o Valor")));
		//carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("Preencha o rpm")));
		
		//System.out.println("Escuderia: " + carro.exibirEscuderia());
		//System.out.println("Valor    : " + carro.exibirValor());
		//System.out.println("RPM      : " + carro.exibirRpm());
		
		carro.preencherTudo(JOptionPane.showInputDialog("Preencha a Escuderia"),
				Float.parseFloat(JOptionPane.showInputDialog("Preencha o Valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Preencha o rpm"))
				);
		
		Object[] exibir = carro.exibirTudo();
		
		for (int ix = 0; ix < exibir.length; ix++)
		{
			System.out.println(exibir[ix].toString());
		}
		
		System.out.println("Desconto 10%     " + carro.exibirPromocao());
		System.out.println("Desconto Gerente " + carro.exibirPromocao((float)50.0));
		
	}

}
