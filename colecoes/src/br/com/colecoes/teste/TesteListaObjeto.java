package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {

		List<Cargo> lista = new ArrayList<Cargo>();

		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome do cargo"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))				
					));
		}while (JOptionPane.showConfirmDialog(null, "Continuar ?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

		double total = 0.0;
		int totalJ = 0;
		int totalS = 0;		

		List<Cargo> salarioMaior = new ArrayList<Cargo>();

		for (Cargo linha: lista)
		{
			System.out.println(linha.getAll());
			total += linha.getSalario();

			if (linha.getNivel().toUpperCase().equals("SENIOR"))
				totalS++;
			else 
				if (linha.getNivel().toUpperCase().equals("JUNIOR"))
					totalJ++;

			if (linha.getSalario() > 5000)
				salarioMaior.add(linha);

		}
		System.out.println("Total Salario " + total);
		System.out.println("Total Junior  " + totalJ);
		System.out.println("Total Senior  " + totalS);

		salarioMaior.forEach(item-> System.out.println(item.getAll()));

	}

}
