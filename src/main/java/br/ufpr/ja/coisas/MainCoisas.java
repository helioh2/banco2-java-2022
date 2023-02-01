package br.ufpr.ja.coisas;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainCoisas{
	public static void main(String[] args) {
		
		Pessoa maria = new Pessoa("Maria Souza", "maria123");
		Pessoa pedro = new Pessoa("Pedro Sanches", "pedro01");
		Pessoa fulano = new Pessoa("Fulano Silva", "fulano01");
		
//		List<Pessoa> cabocos = Arrays.asList(maria, pedro, fulano);
		
		ArrayList<Pessoa> cabocos = new ArrayList<>();
		
		cabocos.add(maria);
		cabocos.add(pedro);
		cabocos.add(fulano);
//		
		System.out.println(cabocos);
		
		
		Comodo sala = new Comodo("Sala");
		
		Integer[] posicaoSofa = {120, 600};
		
		Movel sofa = new Movel("sofa", posicaoSofa);
		Movel tv = new Movel("tv", posicaoSofa);
		Movel estante = new Movel("estante", posicaoSofa);
		sala.addMovel(sofa);
		sala.addMovel(tv);
		sala.addMovel(estante);
		
		System.out.println(sala);
		
		maria.entrar(sala);
		
		Pessoa joaquim = new Pessoa("Joaquim", "joaquim123");
		
		sala.pintar(joaquim, Color.LIGHT_GRAY);
		
//		for (Pessoa pessoa: cabocos) {
//			System.out.println("Nome: "+pessoa.getNome());
//			System.out.println("Username: "+pessoa.getUserName());
//		}
		
//		for (int i=0; i < cabocos.size(); i++) {
//			Pessoa pessoa = cabocos.get(i);
//			System.out.println("Nome: "+pessoa.getNome());
//			System.out.println("Username: "+pessoa.getUserName());
//		}
		
//		int i = 0;
//		while (i < cabocos.size()) {
//			Pessoa pessoa = cabocos.get(i);
//			System.out.println("Nome: "+pessoa.getNome());
//			System.out.println("Username: "+pessoa.getUserName());
//			i++;
//		}
//		
//		System.out.println("Nome: "+maria.getNome());
//		System.out.println("Username: "+maria.getUserName());
		
		cabocos.forEach(pessoa -> {
			System.out.println(pessoa);
		});
		
		
	
//		for (Pessoa pessoa: cabocos) {
//			
//		}
		
		Iterator<Pessoa> iterator1 = cabocos.iterator();
		while (iterator1.hasNext()) {
			// FAZ ALGUMA COISA
			System.out.println(iterator1.next());
		}
		
		
		FileWriter myWriter = null;
		
		try {
			myWriter = new FileWriter("pessoas.txt");
			for (Pessoa pessoa: cabocos) {
				myWriter.write(pessoa.toString());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				myWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
			
		
		
		
		
	}
}
