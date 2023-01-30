package figuras_prot;

import java.awt.*;

import br.ufpr.ja.figuras.Canvas;
import br.ufpr.ja.figuras.DescricaoForma;

public class Retangulo extends Figura {

	protected int largura;
	protected int altura;

	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	@Override // Sobrescrita ou reescrita
	public void redimensionar(int proporcao) {
		this.largura *= proporcao;
		this.altura *= proporcao;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void desenhar() {
		Canvas canvas = Canvas.getCanvas();
		
		canvas.draw(this, new DescricaoForma(new Rectangle(x, y, largura, altura), "red"));
		canvas.wait(10);

	}

}