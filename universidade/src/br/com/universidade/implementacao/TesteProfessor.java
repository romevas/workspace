package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Endereco;
import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor professor = new Professor();
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		endereco.setEstado(JOptionPane.showInputDialog("Estado"));
		endereco.setCep(JOptionPane.showInputDialog("Cep"));
		endereco.setNumero(JOptionPane.showInputDialog("Numero"));
		endereco.setComplemento(JOptionPane.showInputDialog("Complemento"));
		
		professor.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		professor.setNome(JOptionPane.showInputDialog("Nome"));
		professor.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")));
		professor.setFormacao(JOptionPane.showInputDialog("Formacao"));
		professor.setEndereco(endereco);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getFormacao());
		System.out.println(professor.getValorHora());
		System.out.println(professor.getEndereco().getAll());
		
	}

}
