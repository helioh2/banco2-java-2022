package br.ufpr.ja.banco.modelo.contas;  
// ESTÁ DENTRO DO PACOTE MODELO, EM QUE ESTARÃO TODAS AS CLASSES
// QUE REPRESENTAM AS COISAS DO MUNDO REAL

import br.ufpr.ja.banco.modelo.clientes.Cliente;

public class Conta {

	public int agencia;
	public int numero;
	public Cliente cliente;
	public double saldo;
	public double limite;
	
	
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
	
	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("SALDO INSUFICIENTE PARA O VALOR SOLICITADO");
		} else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(double valor) {
		if (valor > this.limite) {
			System.out.println("VALOR DEPOSITADO ACIMA DO LIMITE");
		} else {
			this.saldo += valor;
		}		
	}
	
	public void transferir(double valor, Conta contaDestino) {
		//TODO
	}
	
	
	
	
	
	
	
}
