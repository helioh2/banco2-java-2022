package figuras_prot;

public class MainFiguras {
	
	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo(20, 30, 70, 80);
        retangulo1.desenhar();
        
        Retangulo retangulo2 = new Retangulo(10, 10, 50, 50);
        retangulo2.desenhar();
        
        Xinforimpola xinfo1 = new Xinforimpola(100, 100, 200, 200);
        xinfo1.desenhar();
	}
	
}
