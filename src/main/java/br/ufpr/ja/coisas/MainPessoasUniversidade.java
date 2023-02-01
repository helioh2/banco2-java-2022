package br.ufpr.ja.coisas;

import java.util.Arrays;
import java.util.List;

public class MainPessoasUniversidade {
	
	public static void enviarMensagens(List<IPessoa> pessoas) {
		for (IPessoa pessoa: pessoas) {
			pessoa.receberMensagem("jhsaklshskjhs");
		}
	}
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Marcelo", "marcelo");
		Pessoa pessoa2 = new Pessoa("Fernanda", "fernanda");
		Pessoa pessoa3 = new Pessoa("Jose", "ze1");
		
		pessoa1.getNome();
		
		Estudante aluno1 = new Estudante(pessoa1, "GRR20236363");
		
		Professor professor1 = new Professor(pessoa2, "2626262");
		
		Monitor monitor1 = new Monitor(pessoa1);
		
		
		System.out.println(aluno1.getNome());
		System.out.println(monitor1.getNome());
		
		List<IPessoa> pessoas = Arrays.asList(aluno1, professor1, monitor1, pessoa3);
		
		enviarMensagens(pessoas);
		
		
		
	}

}
