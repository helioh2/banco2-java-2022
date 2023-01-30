package br.ufpr.ja.figuras;

public abstract class Figura {
	
	private int x;
	private int y;
	
	public Figura(int x, int y) {
		this.x = x;  // setando / atribuindo
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public abstract void redimensionar(double proporcao);
	
	public abstract void desenhar();
	
}
