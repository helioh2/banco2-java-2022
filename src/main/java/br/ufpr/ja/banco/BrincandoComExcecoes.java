package br.ufpr.ja.banco;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import br.ufpr.ja.banco.modelo.contas.Conta;
import br.ufpr.ja.banco.modelo.contas.DepositoAcimaDoLimiteException;

public class BrincandoComExcecoes {

	public static void metodo2(int x) throws Exception {
		if (x < 30) {
			throw new Exception("ERRO: parametro invalido no metodo 2");
		}
		System.out.println("metodo2 ok"); // fluxo principal
	}

	public static void metodo1(int x) throws Exception {
//		if (x < 20) { // exceção
//			throw new Exception("ERRO: parametro invalido"); // lançando exceção
//		}
		metodo2(x); // lança a exceção do metodo2 e interrompe metodo1
		System.out.println("metodo1 ok"); // fluxo principal
	}

	public static void main(String[] args) {

		try { // tenta executar metodo1
			metodo1(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("SEGUE A EXECUÇÃO NORMAL DO PROGRAMA 1");

		int[] vetor = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i < 10; i++) {

				vetor[i] = 10 * vetor[i]; // lança exceção se i >= 5
				System.out.println(vetor[i]);

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO: indice fora:" + e.getMessage());
		}

		System.out.println("SEGUE A EXECUÇÃO NORMAL DO PROGRAMA 2");

		Conta conta1 = null;
		try {
			conta1.depositar(100);
		} catch (NullPointerException e) {
			System.out.println("Conta não foi instanciada");
		} catch (DepositoAcimaDoLimiteException e) {
			e.printStackTrace();
		}

		// LEITURA DE ARQUIVOS (EXEMPLO DE EXCEÇÃO CHECKED)
		FileInputStream arquivo = null;
		try {
			arquivo = new FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("SEGUE A EXECUÇÃO NORMAL DO PROGRAMA 3");

	}

}
