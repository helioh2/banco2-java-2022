package br.ufpr.ja.banco.modelo.contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.ufpr.ja.banco.modelo.clientes.Cliente;

class ContaTest {

	@Test
	void quandoDepositarDentroDoLimite() {
		
		// PREPARAÇÃO DO TESTE
		Cliente zeh = new Cliente();
        zeh.cpf = "0123456789";
        zeh.nome = "Zé";
        zeh.email = "ze@bol.com.br";
        		
        Conta conta1 = new Conta(1010, 123, zeh, 1500); 
        
        assertEquals(0, conta1.getSaldo()); // pré-condição
        
        // EXECUÇÃO
        conta1.depositar(1000);
        
        // VERIFICAR
        assertEquals(1000, conta1.getSaldo()); // pós-condição
		
	}
	
	@Test
	void quandoDepositarAcimaDoLimite() {
		
		// PREPARAÇÃO DO TESTE
		Cliente zeh = new Cliente();
        zeh.cpf = "0123456789";
        zeh.nome = "Zé";
        zeh.email = "ze@bol.com.br";
        		
        Conta conta1 = new Conta(1010, 123, zeh, 1500); 
        
        assertEquals(1500, conta1.limite);
        assertEquals(0, conta1.getSaldo()); // pré-condição
        
        // EXECUÇÃO
        conta1.depositar(1800);
        
        // VERIFICAR
        assertEquals(0, conta1.getSaldo()); // pós-condição
		
	}
	
	
	@Test
	void quandoSacarComSaldoSuficiente() {
		// PREPARAÇÃO DO TESTE
		Cliente zeh = new Cliente();
        zeh.cpf = "0123456789";
        zeh.nome = "Zé";
        zeh.email = "ze@bol.com.br";
        		
        Conta conta1 = new Conta(1010, 123, zeh, 1500); 
        
        conta1.depositar(1000);
        assertEquals(1000, conta1.getSaldo()); // pré-condição
        
        // EXECUTAR:
        conta1.sacar(400);
        
        //VERIFICAR:
        assertEquals(600, conta1.getSaldo());
          
	}
	
	@Test
	void quandoSacarSemSaldoSuficiente() {
		// PREPARAÇÃO DO TESTE
		Cliente zeh = new Cliente();
        zeh.cpf = "0123456789";
        zeh.nome = "Zé";
        zeh.email = "ze@bol.com.br";
        		
        Conta conta1 = new Conta(1010, 123, zeh, 1500); 
        
        conta1.depositar(1000);
        assertEquals(1000, conta1.getSaldo()); // pré-condição
        
        // EXECUTAR:
        conta1.sacar(1500);
        
        // VERIFICAR:
        assertEquals(1000, conta1.getSaldo());
	}

}
