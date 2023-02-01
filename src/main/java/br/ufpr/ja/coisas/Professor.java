package br.ufpr.ja.coisas;

public class Professor implements IPessoa{
	
	private Pessoa pessoa;
	private String siad;
	
	public Professor(Pessoa pessoa, String siad) {
		this.pessoa = pessoa;
		this.siad = siad;
	}

	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public String getUsername() {
		return this.pessoa.getUserName();
	}
	
	@Override
	public void setNome(String nome) {
		this.pessoa.setNome(nome);
		
	}

	public String getSiad() {
		return siad;
	}
	
	public void setSiad(String siad) {
		this.siad = siad;
	}
	
	public void receberMensagem(String mensagem) {
		pessoa.receberMensagem(mensagem);
	}
}
