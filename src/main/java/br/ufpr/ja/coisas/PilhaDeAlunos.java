package br.ufpr.ja.coisas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PilhaDeAlunos {
	
	//...
	//atributos
	private ArrayList<String> alunos;
	private int limite;
	
	// SOBRECARGA DE CONSTRUTOR
	public PilhaDeAlunos() {
		alunos = new ArrayList<>();
		this.limite = 10;
	}
	
	public PilhaDeAlunos(int limite) {
		alunos = new ArrayList<>();
		this.limite = limite;
	}
	
	
	public void empilhar(String aluno) throws EmpilhandoEmPilhaCheiaException {
		if (alunos.size() >= limite) { // caso de exceção
			throw new EmpilhandoEmPilhaCheiaException("ERRO: TENTANDO EMPILHAR NUMA PILHA CHEIA");
		}
		alunos.add(aluno);  // adiciona no topo (final da lista)
	}
	
	public String desempilhar() throws DesempilhandoDePilhaVaziaException {
//		if (alunos.size() == 0) { // caso de exceção
//			return "ERRO";
//		}
		try {
			return alunos.remove(alunos.size() - 1);
		} catch (IndexOutOfBoundsException e) {
			throw new DesempilhandoDePilhaVaziaException("ERRO: TENTOU DESEMPILHAR DE UMA PILHA VAZIA");
		}
		
	}
	
	
	public String topo() {
		return alunos.get(alunos.size() - 1);
	}
	
	public boolean isVazia() {
		return alunos.isEmpty();
	}
	
	
//	public List<String> listar() {
//		
//	}
 	
	
	
	
	
}
