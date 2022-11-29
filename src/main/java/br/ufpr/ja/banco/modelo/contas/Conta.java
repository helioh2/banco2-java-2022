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
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) { // caso de exceção
			throw new SaldoInsuficienteException("ERRO: Saldo insuficiente para saque.");
		} else { // fluxo principal
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(double valor) throws DepositoAcimaDoLimiteException {
		if (valor > this.limite) {
//			System.out.println("VALOR DEPOSITADO ACIMA DO LIMITE");
			throw new DepositoAcimaDoLimiteException("ERRO: Valor depositado acima do limite.");
		} else {
			this.saldo += valor;
		}		
	}
	
	/**
	 * Transfere um 'valor' do saldo da conta 'this' para a 'contaDestino'.
	 * @param valor
	 * @param contaDestino
	 * @throws TransferenciaInvalidaException 
	 */
	public void transferir(double valor, Conta contaDestino) throws TransferenciaInvalidaException {
		
//		this.saldo -= valor; // this = este objeto (objeto atual)
//		contaDestino.saldo += valor;
		
		// REFATORAÇÃO:
		try {
			this.sacar(valor);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
			throw new TransferenciaInvalidaException("ERRO: Transferência inválida: " + e.getMessage());
		}
		
		try {
			contaDestino.depositar(valor);
		} catch (DepositoAcimaDoLimiteException e) {
			System.out.println(e.getMessage());
			// rollback (desfazer o saque)
			this.saldo += valor;
			throw new TransferenciaInvalidaException("ERRO: Transferência inválida: " + e.getMessage());
		}
	}
	
	
	
	
	
	
	
}
