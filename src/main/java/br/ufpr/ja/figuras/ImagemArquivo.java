package br.ufpr.ja.figuras;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImagemArquivo implements Desenhavel {

	private BufferedImage img;
	private int x;
	private int y;
	private int largura;
	private int altura;
	

	public ImagemArquivo(BufferedImage img, int x, int y, int largura, int altura) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}


	@Override
	public void draw(Graphics2D graphics) {
		
		graphics.drawImage(this.img, this.x, this.y, this.largura, this.altura, null);
		
	}

}
