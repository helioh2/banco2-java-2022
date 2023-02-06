package br.ufpr.ja.figuras;

import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Circulo extends Figura implements AreaCalculavel {

	private int raio;
	
	
	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}
	
	public int getRaio() {
		return raio;
	}
	
	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public void redimensionar(double proporcao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		
		Canvas canvas = Canvas.getCanvas();
		Ellipse2D circle = new Ellipse2D.Double(this.getX(), this.getY(), this.raio*2, this.raio*2);
		canvas.draw(this, new DescricaoForma(circle, "red"));
		
	}
	
	public int calcularArea() {
		return (int) (Math.PI * Math.pow(raio, 2));
	}

}
