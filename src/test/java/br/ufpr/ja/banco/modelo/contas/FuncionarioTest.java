package br.ufpr.ja.banco.modelo.contas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.ufpr.ja.banco.modelo.clientes.Cliente;
import br.ufpr.ja.banco.modelo.funcionarios.Analista;
import br.ufpr.ja.banco.modelo.funcionarios.ControleBonificacoes;
import br.ufpr.ja.banco.modelo.funcionarios.Diretor;
import br.ufpr.ja.banco.modelo.funcionarios.Funcionario;
import br.ufpr.ja.banco.modelo.funcionarios.Gerente;
import br.ufpr.ja.banco.modelo.funcionarios.Programador;
import br.ufpr.ja.banco.modelo.funcionarios.SistemaInterno;
import br.ufpr.ja.banco.modelo.funcionarios.Testador;
import br.ufpr.ja.coisas.ClassC;

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
				Funcionario f1 = new Analista("Luiza", "28282828282");
				System.out.println(f1.getId());
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				Funcionario f1 = new Programador("Fulano", "121212121212");
				System.out.println(f1.getId());
			}
		};
		
		
		thread1.start();
		thread2.start();
		
	}
	
	
	@Test
	void quandoCriaGerente() {
		
		Funcionario f1 = new Analista("Luiza", "28282828282");
		Funcionario f2 = new Gerente("Fulano", "121212121212");
		Gerente g1 = new Gerente("Beltrano", "28728278282");
		
		
		System.out.println(g1.getNome());
		
		System.out.println(g1);
		
		
	}
	
	@Test
	void quandoGetBonificacao() {
		
//		Funcionario f1 = new Funcionario("Luiza", "28282828282");
//		f1.setSalario(2000);
//		Funcionario f2 = new Funcionario("Fulano", "121212121212");
//		f2.setSalario(3000);
		
		Funcionario f1 = new Analista("Luiza", "28282828282");
		f1.setSalario(2000);
		Funcionario f2 = new Gerente("Fulano", "121212121212");
		f2.setSalario(3000);
		
		Gerente g1 = new Gerente("Beltrano", "28728278282");
		g1.setSalario(5000);
		
		
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		System.out.println(g1.getBonificacao());
		
		
		Gerente g2 = new Gerente("Ana", "282828288282");
		Funcionario f3 = g2;
		f3.setSalario(10000);
		
		System.out.println(f3.getBonificacao());  // Vinculação dinâmica
		
		Programador p1 = new Programador("Zé", "3809380938");
		p1.setSalario(15000);
		p1.getBonificacao();
		
		System.out.println(p1.getBonificacao());
		
		
		System.out.println(p1.toString());
		
		
		Funcionario f4 = new Gerente("Maria", "28282865656");
//		Gerente g3 = new Funcionario("Zé2", "3434343434");
		
		
		
		Analista a1 = new Analista("Carlos", "832388383");
		a1.setSalario(6000);
		
		
		Testador t1 = new Testador("Francisca", "3838383883");
		ControleBonificacoes controleBonificacoes = new ControleBonificacoes();
		List<Funcionario> funcionarios = Arrays.asList(f1, f2, g1, a1, t1);
		System.out.println(controleBonificacoes.calculaBonificacoes(funcionarios));
		
		
		
		SistemaInterno si = new SistemaInterno();
		
		Diretor d1 = new Diretor("Roberto", "298292929");
		
		Cliente c1 = new Cliente();
		c1.setNome("Josefa");
		
		si.autenticar(g1);
		si.autenticar(d1);
		si.autenticar(c1);
		
		
		ClassC c = new ClassC();
		c.sharedMethod1();
	}


}
