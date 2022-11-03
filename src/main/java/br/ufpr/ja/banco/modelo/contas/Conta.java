package br.ufpr.ja.banco.modelo.contas;  
// ESTÁ DENTRO DO PACOTE MODELO, EM QUE ESTARÃO TODAS AS CLASSES
// QUE REPRESENTAM AS COISAS DO MUNDO REAL

import br.ufpr.ja.banco.modelo.clientes.Cliente;

public class Conta {

	private int agencia;
	private int numero;
	private Cliente cliente;
	private double saldo;
	private double limite;
	
	
	public Conta(int agencia, int numero, Cliente cliente) { 
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
		this.limite = 0;
	}
	
	// SOBRECARGA DE CONSTRUTOR
	public Conta(int agencia, int numero, Cliente cliente, int limite) { 
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
		this.limite = limite;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	// Não será possível alterar a agência. Portanto, não tem setAgencia
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	// Não será possível alterar cliente. Portanto, não tem setCliente
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite() {
		this.limite = limite;
	}

	
	public boolean sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("SALDO INSUFICIENTE PARA O VALOR SOLICITADO");
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public boolean depositar(double valor) {
		if (valor > this.limite) {
			System.out.println("VALOR DEPOSITADO ACIMA DO LIMITE");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}		
	}
	
	/**
	 * Transfere um 'valor' do saldo da conta 'this' para a 'contaDestino'.
	 * @param valor
	 * @param contaDestino
	 */
	public void transferir(double valor, Conta contaDestino) {
		
//		this.saldo -= valor; // this = este objeto (objeto atual)
//		contaDestino.saldo += valor;
		
		// REFATORAÇÃO:
		boolean conseguiuSacar = this.sacar(valor);
		if (conseguiuSacar) {
			boolean conseguiuDepositar = contaDestino.depositar(valor);
			if (!conseguiuDepositar) {
				// DESFAZER O SAQUE NO THIS:
				this.saldo += valor;
			}
		}
		
	}
	
	
	
	
	
	
	
}
