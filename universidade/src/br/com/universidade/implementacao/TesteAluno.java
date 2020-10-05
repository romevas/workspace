package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;
import br.com.universidade.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		endereco.setEstado(JOptionPane.showInputDialog("Estado"));
		endereco.setCep(JOptionPane.showInputDialog("Cep"));
		endereco.setNumero(JOptionPane.showInputDialog("Numero"));
		endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
		
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Aluno").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase(),
				endereco
				);
		
		System.out.println(aluno.getAll());
	}

}
