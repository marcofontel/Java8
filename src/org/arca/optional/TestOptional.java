package org.arca.optional;

public class TestOptional {
	
	
	public static void main(String[] args) {
		Curso cursoAdm = new Curso("Administração");
		
		Aluno jose = new Aluno("Jose");
		jose.setMatricula(new Matricula("1100"));
		cursoAdm.getListaAluno().add(jose);
		
		Aluno maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("1200"));
		cursoAdm.getListaAluno().add(maria);
	
		Aluno Ana = new Aluno("Ana");
		Ana.setMatricula(new Matricula("1300"));
		cursoAdm.getListaAluno().add(Ana);
		
		Aluno paulo = new Aluno("Paulo");
		paulo.setMatricula(new Matricula("1400"));
		cursoAdm.getListaAluno().add(paulo);
		
		cursoAdm.getListaAluno().forEach(a->System.out.println(a.getNome() + " "+a.getMatricula().getNumero()));
		
	}
}
