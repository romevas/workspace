package br.com.universidade.modelo;

public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	
	public String getAll() {
		return 
				"RM       : " + rm + "\n" +
				"Nome     : " + nome + "\n" +
				"Email    : " + email + "\n" +
				"Endereco   : \n" 
				+ endereco.getAll();
	}
	public void setAll(int p1, String p2, String p3, Endereco p4) {
		rm = p1;
		nome = p2;
		email = p3;
		endereco = p4;	
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}