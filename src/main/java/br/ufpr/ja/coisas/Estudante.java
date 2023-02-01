package br.ufpr.ja.coisas;

public class Estudante implements IPessoa{
	
	private Pessoa pessoa;
	private String grr;
	
	public Estudante(Pessoa pessoa, String grr) {
		this.pessoa = pessoa;
		this.grr = grr;
	}

	public String getNome() {
		return this.pessoa.getNome();
	}
	
	@Override
	public void setNome(String nome) {
		this.pessoa.setNome(nome);
		
	}
	
	public String getUsername() {
		return this.pessoa.getUserName();
	}
	
	public String getGrr() {
		return grr;
	}
	
	public void setGrr(String grr) {
		this.grr = grr;
	}
	
	public void receberMensagem(String mensagem) {
		pessoa.receberMensagem(mensagem);
	}
	
}
