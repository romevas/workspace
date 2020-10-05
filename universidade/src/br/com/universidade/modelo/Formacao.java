package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public abstract class Formacao implements PadraoFormacao {
	private float valor;
	private String descricao;
	private int duracao;
	
	public Formacao() {
		super();
	}
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}	
	public void setAll(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}	
	public String getAll() {
		return
				"Valor: " + valor + "\n" +
				"Descricao: " + descricao + "\n" +
				"Duracao: " + duracao;		
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double calcularMensalidade(float fator) {
		return 0;
	}
	public void definirDuracao() {
	}

}
