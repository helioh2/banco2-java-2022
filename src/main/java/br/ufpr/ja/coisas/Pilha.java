package br.ufpr.ja.coisas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
	
	//...
	//atributos
	private ArrayList<T> itens;
	private int limite;
	
	// SOBRECARGA DE CONSTRUTOR
	public Pilha() {
		itens = new ArrayList<>();
		this.limite = 10;
	}
	
	public Pilha(int limite) {
		itens = new ArrayList<>();
		this.limite = limite;
	}
	
	
	public void empilhar(T aluno) throws EmpilhandoEmPilhaCheiaException {
		if (itens.size() >= limite) { // caso de exceção
			throw new EmpilhandoEmPilhaCheiaException("ERRO: TENTANDO EMPILHAR NUMA PILHA CHEIA");
		}
		itens.add(aluno);  // adiciona no topo (final da lista)
	}
	
	public T desempilhar() throws DesempilhandoDePilhaVaziaException {
//		if (itens.size() == 0) { // caso de exceção
//			return "ERRO";
//		}
		try {
			return itens.remove(itens.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new DesempilhandoDePilhaVaziaException("ERRO: TENTOU DESEMPILHAR DE UMA PILHA VAZIA");
		}
		
	}
	
	
	public T topo() {
		return itens.get(itens.size() - 1);
	}
	
	public boolean isVazia() {
		return itens.isEmpty();
	}
	
	
//	public List<String> listar() {
//		
//	}
 	
	
	
	
	
}
