package br.ufpr.ja.coisas;

import java.util.List;

public class Movel {
	
	private String nome;
	private Integer[] posicao;
	
	
	public Movel(String nome, Integer[] posicao) {
		super();
		this.nome = nome;
		this.posicao = posicao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer[] getPosicao() {
		return posicao;
	}


	public void mover(Integer[] posicao) {
		this.posicao = posicao;
	}
	
	
	
	

}
