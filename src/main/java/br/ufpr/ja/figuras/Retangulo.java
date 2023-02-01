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
	
	
	// METODOS AUXILIARES:
	private void redimensionarLargura(double proporcao) {
		this.largura *= proporcao;
	}
	
	private void redimensionarAltura(double proporcao) {
		this.altura *= proporcao;
	}
	
	
	@Override
	public void redimensionar(double proporcao) {
//		this.largura = (int) (this.largura * proporcao);
//		this.altura = (int) (this.altura * proporcao);
		this.redimensionarLargura(proporcao);
		this.redimensionarAltura(proporcao);

	}

	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("DESENHANDO UM RETANGULO");

		Canvas canvas = Canvas.getCanvas();
		Rectangle shape = new Rectangle(
							this.getX(), 
							this.getY(), 
							this.largura, 
							this.altura);
		
		DescricaoForma descricao = new DescricaoForma(shape, "red");

		canvas.draw(this, descricao);
	}

}
