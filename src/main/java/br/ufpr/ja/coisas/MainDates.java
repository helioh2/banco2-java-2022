package br.ufpr.ja.coisas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDates {
	
	public static void main(String[] args) {
		
		String dataString = "08/11/2017 17:00";
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime data = LocalDateTime.parse(dataString, formatador);
		
		System.out.println(data.format(formatador));
		
		data = data.plusDays(10);
		
		System.out.println(data.format(formatador));
		
		List<Integer> list1 = new ArrayList<>();
		list1.remove(10);
		
		Map<Integer, String> map1 = new HashMap<>();
//		map1.remo]
		
		Pilha<Pessoa> pessoas = new Pilha<>();
		Pilha<Integer> inteiros = new Pilha<>();
		Pilha<String> strings = new Pilha<>();
		
		
		
		
		
		// PARAMETRIZAÇÃO DE TIPO
	}

}
