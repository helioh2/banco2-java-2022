package br.ufpr.ja.banco.modelo.contas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.ufpr.ja.coisas.DesempilhandoDePilhaVaziaException;
import br.ufpr.ja.coisas.EmpilhandoEmPilhaCheiaException;
import br.ufpr.ja.coisas.PilhaDeAlunos;

class PilhaTest {

	@Test
	void quandoAdicionaEmUmArrayList() {
		
		List<String> listaDeCompras = new ArrayList<>();
		
		listaDeCompras.add(0, "ARROZ");
		listaDeCompras.add("FEIJAO");
		listaDeCompras.add("MACARRAO");
		
		listaDeCompras.add(1, "TEMPERO");
		
	}
	
	
	@Test
	void quandoEmpilhaEmUmaPilhaVazia() throws EmpilhandoEmPilhaCheiaException {
		
		// QUANDO (PREPARAÇÃO):
		PilhaDeAlunos pilha = new PilhaDeAlunos();
		
		String aluno1 = "Fulano";
	
		// EXECUTA
		pilha.empilhar(aluno1);
		
		// VERIFICAÇÃO
		assertEquals(aluno1, pilha.topo());
		
	}
	
	@Test
	void quandoDesempilhaDeUmaPilhaVazia() {
		
		// QUANDO (PREPARAÇÃO):
		PilhaDeAlunos pilha = new PilhaDeAlunos();
	
		// EXECUTA
		try {
			pilha.desempilhar();
		} catch (DesempilhandoDePilhaVaziaException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	@Test
	void quandoEmpilhaDeUmaPilhaCheia() {
		
		// QUANDO (PREPARAÇÃO):
		PilhaDeAlunos pilha = new PilhaDeAlunos(3);
		
		try {
			pilha.empilhar("Joao");
			pilha.empilhar("Maria");
			pilha.empilhar("Zé");
		} catch (EmpilhandoEmPilhaCheiaException e1) {
			System.out.println("NAO VAI CAIR AQUI");
		}

		try {
			pilha.empilhar("Ana");
		} catch (EmpilhandoEmPilhaCheiaException e1) {
			System.out.println(e1.getMessage());
			System.out.println("VAI CAIR AQUI");
		}
		
	
		// EXECUTA
		try {
			pilha.desempilhar();
		} catch (DesempilhandoDePilhaVaziaException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
