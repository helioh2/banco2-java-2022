package br.ufpr.ja.banco.modelo.funcionarios;

import br.ufpr.ja.banco.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {

	public Diretor(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double getBonificacao() {
		return 0;
	}
	
	@Override
	public void autentica() {
		//...
		System.out.println("AUTENTICANDO DIRETOR:"+this.getNome());
	}

		
}
