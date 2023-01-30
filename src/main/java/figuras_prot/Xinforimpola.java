package figuras_prot;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import br.ufpr.ja.figuras.Canvas;
import br.ufpr.ja.figuras.ImagemArquivo;

public class Xinforimpola extends Figura {

	private int x;
	private int y;
	private int largura;
	private int altura;
	

	public Xinforimpola(int x, int y, int largura, int altura) {
		super();
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public void redimensionar(int proporcao) {
		this.largura *= proporcao;
		this.altura *= proporcao;
	}

	@Override
	public void desenhar() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("xinforimpola.png"));
		} catch (IOException e) {
			System.out.println("Imagem não encontrada");
		}
		
		Canvas canvas = Canvas.getCanvas();
		canvas.draw(this, new ImagemArquivo(img, this.x, this.y, this.altura, this.altura));
		canvas.wait(10);
	}
	
}
