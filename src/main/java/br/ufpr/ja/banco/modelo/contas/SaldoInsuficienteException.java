package br.ufpr.ja.banco.modelo.contas;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String message) {
        super(message);
    }
	
}
