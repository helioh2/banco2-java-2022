package br.ufpr.ja.coisas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainDates {
	
	public static void main(String[] args) {
		
		String dataString = "08/11/2017 17:00";
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime data = LocalDateTime.parse(dataString, formatador);
		
		System.out.println(data.format(formatador));
		
		data = data.plusDays(10);
		
		System.out.println(data.format(formatador));
		
	}

}
