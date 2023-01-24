package br.ufpr.ja.banco.modelo.funcionarios;

import br.ufpr.ja.banco.Autenticavel;

public class SistemaInterno {
	
	//...
	
	
	// SOBRECARGA DE MÉTODO
	public void autenticar(Autenticavel autenticavel) {
		autenticavel.autentica();
	}

	
}
