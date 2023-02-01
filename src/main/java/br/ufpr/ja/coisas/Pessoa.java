package br.ufpr.ja.coisas;

public class Pessoa implements IPessoa {
	
	private String nome;
	private String userName;
	private Comodo comodo = null;
	
	
	public Pessoa(String nome, String userName) {
		super();
		this.nome = nome;
		this.userName = userName;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Comodo getComodo() {
		return comodo;
	}
	
	public void entrar(Comodo comodo) {
		this.comodo = comodo;
		this.comodo.addPessoa(this);
		
	}
	
//	
//	public void printPessoa() {
//		System.out.println("Nome: "+this.getNome());
//		System.out.println("Username: "+this.getUserName());
//	}
	
	
	@Override
	public String toString() {
		String str = "";
		str += "\tNome: "+this.nome + "\n";
		str += "\tUsername: "+this.getUserName() + "\n";
		return str;
	}
	
	
	public void receberMensagem(String mensagem) {
		System.out.println("ENVIANDO MENSAGEM PARA A PESSOA "+this.nome);
	}


	
	
	

}
