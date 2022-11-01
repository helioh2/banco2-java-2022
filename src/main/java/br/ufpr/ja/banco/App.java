package br.ufpr.ja.banco;

import br.ufpr.ja.banco.modelo.clientes.Cliente;
import br.ufpr.ja.banco.modelo.contas.Conta;

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
        zeh.cpf = "0123456789";  // setando os atributos do objeto após a criação
        zeh.nome = "Zé";
        zeh.email = "ze@bol.com.br";
        		
        Conta conta1 = new Conta(1010, 123, zeh); 
        // usando um construtor personalizado que já passa
        // informações para dentro do objeto
        
        zeh.nome = "José da Silva";
        
        Cliente maria = new Cliente();
        maria.cpf = "27272727272";
        maria.nome = "Maria";
        
        
        Conta conta2 = new Conta(1011, 124, maria, 1000);
        
        System.out.println(conta2.saldo);
        
        conta1.depositar(1000);
        
        System.out.println(conta1.getSaldo());
        
    }
}
