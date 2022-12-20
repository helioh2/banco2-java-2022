package br.ufpr.ja.banco.modelo.funcionarios;

import java.util.List;

public class Gerente extends Funcionario {

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
	
//	public void metodo1() {
//		this.cpf += " oba";
//	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 500;
	}
	
	
	
}
