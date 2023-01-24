package br.ufpr.ja.banco.modelo.funcionarios;

public class Analista extends Funcionario{

	public Analista(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario()*0.5;
	}
	
	

}
