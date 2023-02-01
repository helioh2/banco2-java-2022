package br.ufpr.ja.figuras;

import java.util.Arrays;
import java.util.List;

public class MainFiguras {
	
	public static void mudaLarguraRetangulos(List<Retangulo> retangulos, double proporcao) {
		for (Retangulo ret: retangulos) {
			ret.setLargura((int) (ret.getLargura()*proporcao));
		}
	}
	
	public static void main(String[] args) {
		
		Retangulo ret1 = new Retangulo(300, 200, 200, 100); // x, y, largura, altura
		ret1.desenhar();
		
		Retangulo ret2 = new Retangulo(100, 100, 50, 70);
		ret2.desenhar();
		
		Circulo circ1 = new Circulo(120, 70, 50); // x, y, raio
		circ1.desenhar();
		
		circ1.redimensionar(2); // duplica o tamanho do quadrado
		
		ret1.redimensionar(0.5);
		System.out.println(ret1.getAltura());
		System.out.println(ret1.getLargura());
		
		ret1.desenhar();
		
		Quadrado quad1 = null;
		quad1 = new Quadrado(60, 70, 100);
		
		
		quad1.redimensionar(0.5);
//		System.out.println(quad1.getLargura());
//		System.out.println(quad1.getAltura());
		
		List<Retangulo> retangulos = Arrays.asList(ret1, ret2);
		
		mudaLarguraRetangulos(retangulos, 2);
		
		ret1.desenhar();
		ret2.desenhar();
		quad1.desenhar();
		
	}

}
