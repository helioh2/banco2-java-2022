package figuras_prot;

import br.ufpr.ja.figuras.Canvas;

public abstract class Figura {
    
    protected int x;
    protected int y;
    protected Canvas canvas;

    public void mover(int dx, int dy) {
        // MÉTODO CONCRETO (JÁ TEM IMPLEMENTAÇÃO)
        this.x += dx;
        this.y += dy;
        this.desenhar();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void redimensionar(int proporcao);

    public abstract void desenhar();

}