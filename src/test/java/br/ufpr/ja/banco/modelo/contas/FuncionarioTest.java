package br.ufpr.ja.banco.modelo.contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.ufpr.ja.banco.modelo.funcionarios.Funcionario;
import br.ufpr.ja.banco.modelo.funcionarios.Gerente;

class FuncionarioTest {

	@Test
	void quandoCriaFuncionario() {
		
//		Funcionario funcionario1 = new Funcionario("Luiza", "28282828282");
//		Funcionario funcionario2 = new Funcionario("Fulano", "121212121212");
//		
//		System.out.println(funcionario1.idUltimo);
//		System.out.println(funcionario2.idUltimo);
		
//		System.out.println(funcionario1.getId());
//		System.out.println(funcionario2.getId());
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				Funcionario f1 = new Funcionario("Luiza", "28282828282");
				System.out.println(f1.getId());
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				Funcionario f1 = new Funcionario("Fulano", "121212121212");
				System.out.println(f1.getId());
			}
		};
		
		
		thread1.start();
		thread2.start();
		
	}
	
	
	@Test
	void quandoCriaGerente() {
		
		Funcionario f1 = new Funcionario("Luiza", "28282828282");
		Funcionario f2 = new Funcionario("Fulano", "121212121212");
		Gerente g1 = new Gerente("Beltrano", "28728278282");
		
		
		System.out.println(g1.getNome());
		
		System.out.println(g1);
		
		
	}
	
	@Test
	void quandoGetBonificacao() {
		
		Funcionario f1 = new Funcionario("Luiza", "28282828282");
		f1.setSalario(2000);
		Funcionario f2 = new Funcionario("Fulano", "121212121212");
		f2.setSalario(3000);
		Gerente g1 = new Gerente("Beltrano", "28728278282");
		g1.setSalario(5000);
		
		
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		System.out.println(g1.getBonificacao());
		
		
	}


}
