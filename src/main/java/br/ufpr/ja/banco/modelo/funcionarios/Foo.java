package br.ufpr.ja.banco.modelo.funcionarios;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;

public class Foo extends ArrayList<Funcionario> {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("fulano", "2828282828");
//		String x = g1.cpf;
		
		Foo foo1 = new Foo();
		foo1.clear(); // método da classe mãe List
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addAll(Collection<? extends Funcionario> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Funcionario get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
