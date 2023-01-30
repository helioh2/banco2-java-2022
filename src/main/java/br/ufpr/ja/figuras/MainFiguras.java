package br.ufpr.ja.figuras;

import java.util.List;

public class MainFiguras {
	
	public static void main(String[] args) {
		
		Retangulo ret1 = new Retangulo(300, 200, 200, 100); // x, y, largura, altura
		ret1.desenhar();
		
		Retangulo ret2 = new Retangulo(100, 100, 50, 70);
		ret2.desenhar();
		
		Circulo circ1 = new Circulo(120, 70, 50); // x, y, raio
		circ1.desenhar();
		
		circ1.redimensionar(2); // duplica o tamanho do quadrado
		ret1.redimensionar(0.5);
		
	}

}
