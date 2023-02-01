package br.ufpr.ja.figuras;

public class QuadradoEstranho extends Retangulo {
	
	private int lado;

	public QuadradoEstranho(int x, int y, int largura, int altura) throws Exception {
		super(x, y, largura, altura);
		if (largura != altura) {
			throw new Exception("Não pode criar quadrado com tamanhos de lado diferente");
		}
		this.lado = altura;
	}
	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public void setLargura(int largura) {
		super.setLargura(largura);
		super.setAltura(largura);
	}

	public void setAltura(int altura) {
		super.setLargura(altura);
		super.setAltura(altura);
	}
	

}
