package br.com.universidade.modelo;

public class Professor {
	private int id;
	private String nome;
	private float valorHora;
	private String formacao;
	private Endereco endereco;

	public String getAll()
	{
		return
				"ID         : " + id + "\n" +
				"Nome       : " + nome + "\n" +
				"Valor Hora : " + valorHora + "\n" +
				"Formacao   : " + formacao + "\n" +
				"Endereco   : \n" 
				+ endereco.getAll();

	}
	public void setAll(int id, String nome, float valorHora, String formacao, Endereco endereco)
	{
		this.id = id;
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.endereco = endereco;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
