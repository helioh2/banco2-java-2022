package br.ufpr.ja.figuras;

import java.awt.Shape;
import java.awt.Graphics2D;
import java.awt.Color;

public class DescricaoForma implements Desenhavel
{
    private Shape shape;
    private String colorString;

    public DescricaoForma(Shape shape, String color)
    {
        this.shape = shape;
        this.colorString = color;
    }

    
    /**
     * Set the foreground color of the Canvas.
     * @param  newColor   the new color for the foreground of the Canvas 
     */
    private void setForegroundColor(Graphics2D graphic)
    {
        if(colorString.equals("red")) {
            graphic.setColor(new Color(235, 25, 25));
        }
        else if(colorString.equals("black")) {
            graphic.setColor(Color.black);
        }
        else if(colorString.equals("blue")) {
            graphic.setColor(new Color(30, 75, 220));
        }
        else if(colorString.equals("yellow")) {
            graphic.setColor(new Color(255, 230, 0));
        }
        else if(colorString.equals("green")) {
            graphic.setColor(new Color(80, 160, 60));
        }
        else if(colorString.equals("magenta")) {
            graphic.setColor(Color.magenta);
        }
        else if(colorString.equals("white")) {
            graphic.setColor(Color.white);
        }
        else {
            graphic.setColor(Color.black);
        }
    }
    
    public void draw(Graphics2D graphic)
    {
        this.setForegroundColor(graphic);
        graphic.fill(this.shape);
    }
}
