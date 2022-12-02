package org.arca.optional;

public class Aluno{

	private Matricula matricula;
	private String nome;
	public Aluno( String nome) {
		super();
		this.nome = nome;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}