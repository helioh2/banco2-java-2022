package br.ufpr.ja.coisas;

import java.util.ArrayList;
import java.util.List;

public class Comodo {
	
	private String nome;
	private List<Pessoa> pessoas;
	private List<Movel> moveis;
	
	public Comodo(String nome) {
		super();
		this.nome = nome;
		this.pessoas = new ArrayList<>();
		this.moveis = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void addPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void addMovel(Movel movel) {
		this.moveis.add(movel);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "Nome do comodo: " + this.nome +"\n";
		str += "Moveis:\n";
		for (Movel movel: this.moveis) {
			str += "\t - " + movel.getNome()+ "\n";
		}
		return str;
				
	}
	
	

}
