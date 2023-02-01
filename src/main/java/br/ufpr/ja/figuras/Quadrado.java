package br.ufpr.ja.figuras;

import java.awt.Rectangle;

public class Quadrado extends Figura {
	
	private int lado;
	
	public Quadrado(int x, int y, int lado) {
		super(x, y);
		this.lado = lado;
	}

	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	@Override
	public void redimensionar(double proporcao) {
		this.lado *= proporcao;
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("DESENHANDO UM QUADRADO");

		Canvas canvas = Canvas.getCanvas();
		Rectangle shape = new Rectangle(
							this.getX(), 
							this.getY(), 
							this.lado, 
							this.lado);
		
		DescricaoForma descricao = new DescricaoForma(shape, "red");

		canvas.draw(this, descricao);
		
	}
	

}
