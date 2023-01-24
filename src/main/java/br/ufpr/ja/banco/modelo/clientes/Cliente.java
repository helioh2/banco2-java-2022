package br.ufpr.ja.banco.modelo.clientes;

import br.ufpr.ja.banco.Autenticavel;

public class Cliente implements Autenticavel {
	
	private String nome;
	private String cpf;
	private String email;
	private String nomeDaMae;
	
	
	public Cliente() { }
	
	public Cliente(String nome, String cpf, String email, String nomeDaMae) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nomeDaMae = nomeDaMae;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	@Override
	public void autentica() {
		System.out.println("AUTENTICANDO CLIENTE:" + this.getNome());
		
	}

	

}
