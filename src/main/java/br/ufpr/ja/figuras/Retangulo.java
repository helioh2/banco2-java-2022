package br.ufpr.ja.figuras;

import java.awt.Rectangle;

public class Retangulo extends Figura {

	private int largura;
	private int altura;

	public Retangulo(int x, int y, int largura, int altura) {
		super(x, y);
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void redimensionar(double proporcao) {
		// TODO Auto-generated method stub

	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("DESENHANDO UM RETANGULO");

		Canvas canvas = Canvas.getCanvas();
		canvas.draw(this, new DescricaoForma( new Rectangle(
								this.getX(), 
								this.getY(), 
								this.largura, 
								this.altura),
							"red")
				);
	}

}
