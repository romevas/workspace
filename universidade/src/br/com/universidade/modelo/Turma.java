package br.com.universidade.modelo;

public class Turma {
	private String nome;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;

	public Turma() {
		super();
	}
	public Turma(String nome, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.nome = nome;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	public void setAll(String nome, String periodo, Curso curso, Aluno aluno, Professor professor) {
		this.nome = nome;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}
	public String getAll() {
		return 
				"Nome Turma: " + nome + "\n" +
				"Periodo: " + periodo + "\n" + 
				"Curso: \n" +
				curso.getAll() +
				"Aluno: \n" +
				aluno.getAll() +
				"Professor: \n" +
				professor.getAll();		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
