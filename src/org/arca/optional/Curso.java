package org.arca.optional;

import java.util.ArrayList;
import java.util.List;

public
class Curso{
	
	private String nome;
	private List<Aluno> listaAluno;
	public Curso(String nome) {
		super();
		this.nome = nome;
		this.listaAluno = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}
	
}

