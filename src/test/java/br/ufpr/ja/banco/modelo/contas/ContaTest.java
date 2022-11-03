package br.ufpr.ja.banco.modelo.contas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.ufpr.ja.banco.modelo.clientes.Cliente;

class ContaTest {
	
	
	Conta contaOrigem;
	Conta contaDestino;
	
	
	@BeforeEach
	void init() {
		// PREPARAÇÃO DO TESTE
		Cliente zeh = new Cliente();
        zeh.setCpf("0123456789");
        zeh.setNome("Zé");
        zeh.setEmail("ze@bol.com.br");
        		
        contaOrigem = new Conta(1010, 123, zeh, 1500); 
		
        
        Cliente maria = new Cliente();
        maria.setCpf("9876543210");
        maria.setNome("Maria");
        maria.setEmail("maria@bol.com.br");
        
        contaDestino = new Conta(1011, 124, maria, 1000);
        
	}
	
	@AfterEach
	void tearDown() {
		
	}

	@Test
	void quandoDepositarDentroDoLimite() {
	
		// PREPARAÇÃO DO TESTE
        assertEquals(0, contaOrigem.getSaldo()); // pré-condição
        
        // EXECUÇÃO
        contaOrigem.depositar(1000);
        
        // VERIFICAR
        assertEquals(1000, contaOrigem.getSaldo()); // pós-condição
		
	}
	
	@Test
	void quandoDepositarAcimaDoLimite() {
		
		// PREPARAÇÃO DO TESTE
        assertEquals(1500, contaOrigem.getLimite());
        assertEquals(0, contaOrigem.getSaldo()); // pré-condição
        
        // EXECUÇÃO
        contaOrigem.depositar(1800);
        
        // VERIFICAR
        assertEquals(0, contaOrigem.getSaldo()); // pós-condição
		
	}
	
	
	@Test
	void quandoSacarComSaldoSuficiente() {
		
		// PREPARAÇÃO DO TESTE
        contaOrigem.depositar(1000);
        assertEquals(1000, contaOrigem.getSaldo()); // pré-condição
        
        // EXECUTAR:
        contaOrigem.sacar(400);
        
        //VERIFICAR:
        assertEquals(600, contaOrigem.getSaldo());
          
	}
	
	@Test
	void quandoSacarSemSaldoSuficiente() {
        
		// PREPARAÇÃO DO TESTE
        contaOrigem.depositar(1000);
        assertEquals(1000, contaOrigem.getSaldo()); // pré-condição
        
        // EXECUTAR:
        contaOrigem.sacar(1500);
        
        // VERIFICAR:
        assertEquals(1000, contaOrigem.getSaldo());
	}
	
	
	@Test
	void quandoTransferirComSaldoSuficienteNaOrigem() {
		
		// PREPARAÇÃO DO TESTE
        contaOrigem.depositar(1000);
        assertEquals(1000, contaOrigem.getSaldo());
        assertEquals(0, contaDestino.getSaldo());
        
        // EXECUÇÃO
        contaOrigem.transferir(400, contaDestino);
        
        // VERIFICAÇÃO
        assertEquals(600, contaOrigem.getSaldo());
        assertEquals(400, contaDestino.getSaldo());
    
	}
	
    
    @Test
    void quandoTransferirSemSaldoSuficienteNaOrigem() {
    	
    	// PREPARAÇÃO DO TESTE
        contaOrigem.depositar(300);  // CHAMADA DO MÉTODO --> MODIFICA O OBJETO
        
        assertEquals(300, contaOrigem.getSaldo()); // VERIFICA ESTADO DO OBJETO
        assertEquals(0, contaDestino.getSaldo());
        
        // EXECUÇÃO
        contaOrigem.transferir(400, contaDestino);
        
        // VERIFICAÇÃO
        assertEquals(300, contaOrigem.getSaldo());
        assertEquals(0, contaDestino.getSaldo());
        
    }
    
    @Test
    void quandoTransferirSemgLimiteNoDestino() {
    	
    	// PREPARAÇÃO DO TESTE
        contaOrigem.depositar(1500);  // CHAMADA DO MÉTODO --> MODIFICA O OBJETO
        
        assertEquals(1500, contaOrigem.getSaldo()); // VERIFICA ESTADO DO OBJETO
        assertEquals(0, contaDestino.getSaldo());
        assertEquals(1000, contaDestino.getLimite());
        
        // EXECUÇÃO 
        contaOrigem.transferir(1500, contaDestino);
        
        // VERIFICAÇÃO
        assertEquals(1500, contaOrigem.getSaldo());
        assertEquals(0, contaDestino.getSaldo());
        assertEquals(1000, contaDestino.getLimite());
    	
    }
    
    @Test
    void quandoTentarAlterarOSaldoDiretamente() {
    	
//    	contaOrigem.saldo = 10000000;  // EU NÃO GOSTARIA QUE ISSO PUDESSE SER FEITO!!!!
    	assertEquals(0, contaOrigem.getSaldo());
    }
    
	
	

}
