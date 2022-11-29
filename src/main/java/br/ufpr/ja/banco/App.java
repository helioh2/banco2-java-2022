package br.ufpr.ja.banco;

import br.ufpr.ja.banco.modelo.clientes.Cliente;
import br.ufpr.ja.banco.modelo.contas.Conta;
import br.ufpr.ja.banco.modelo.contas.DepositoAcimaDoLimiteException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Cliente zeh = new Cliente();
        zeh.setCpf("0123456789");
        zeh.setNome("Zé");
        zeh.setEmail("ze@bol.com.br");
        		
        Conta conta1 = new Conta(1010, 123, zeh); 
        // usando um construtor personalizado que já passa
        // informações para dentro do objeto
        
        zeh.setNome("José da Silva");
        
        Cliente maria = new Cliente();
        maria.setCpf("9876543210");
        maria.setNome("Maria");
        maria.setEmail("maria@bol.com.br");
        
        
        Conta conta2 = new Conta(1011, 124, maria, 1000);
        
        System.out.println(conta2.getSaldo());
        
        try {
			conta1.depositar(1000);
		} catch (DepositoAcimaDoLimiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(conta1.getSaldo());
        
    }
}
