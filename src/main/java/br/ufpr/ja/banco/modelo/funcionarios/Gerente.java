package br.ufpr.ja.banco.modelo.funcionarios;

import java.util.List;

import br.ufpr.ja.banco.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	private String senha;
	private List<Funcionario> funcionariosSubordinados;
	
	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void addFuncionarioSubordinado(Funcionario funcionario) {
		this.funcionariosSubordinados.add(funcionario);
	}
	
	public List<Funcionario> getFuncionariosSubordinados() {
		return this.funcionariosSubordinados;
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.1 + 500;
	}
	
//	public void metodo1() {
//		this.cpf += " oba";
//	}
	
	@Override
	public void autentica() {
		System.out.println("AUTENTICANDO GERENTE:"+this.getNome());
		
	}
	


	
	
	
	
}
