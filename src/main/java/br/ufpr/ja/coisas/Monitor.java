package br.ufpr.ja.coisas;

public class Monitor implements IPessoa{
	
	
	private Pessoa pessoa;
	
	public Monitor(Pessoa pessoa) {
		this.pessoa = pessoa;
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
	
	public void receberMensagem(String mensagem) {
		pessoa.receberMensagem(mensagem);
	}

}
