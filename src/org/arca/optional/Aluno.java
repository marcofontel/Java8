package org.arca.optional;

import java.util.Optional;

public class Aluno{

	private Optional<Matricula> matricula;
	private String nome;
	public Aluno( String nome) {
		super();
		this.nome = nome;
		this.matricula = Optional.empty();
	}
	public Optional<Matricula> getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = Optional.of(matricula);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}