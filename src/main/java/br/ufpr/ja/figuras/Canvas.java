package br.ufpr.ja.figuras;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Canvas is a class to allow for simple graphical drawing on a canvas.
 * This is a modification of the general purpose Canvas, specially made for
 * the BlueJ "shapes" example. 
 * 
 * Adaptador por Helio H. Monte-Alto
 *
 * @author: Bruce Quig
 * @author: Michael Kölling (mik)
 *
 * @version 2016.02.29
 */
public class Canvas
{
    // Note: The implementation of this class (specifically the handling of
    // shape identity and colors) is slightly more complex than necessary. This
    // is done on purpose to keep the interface and instance fields of the
    // shape objects in this project clean and simple for educational purposes.

    private static Canvas canvasSingleton;

    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas()
    {
        if(canvasSingleton == null) {
            canvasSingleton = new Canvas("BlueJ Picture Demo", 600, 400, 
                                         Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    //  ----- atributos da instância: -----

    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;
    private HashMap<Object, Desenhavel> shapes;
    
    /**
     * Create a Canvas.
     * @param title    title to appear in Canvas this.frame
     * @param width    the desired width for the canvas
     * @param height   the desired height for the canvas
     * @param bgColor the desired background color of the canvas
     */
    private Canvas(String title, int width, int height, Color bgColor)
    {
        this.frame = new JFrame();
        this.canvas = new CanvasPane();
        this.frame.setContentPane(canvas);
        this.frame.setTitle(title);
        this.frame.setLocation(30, 30);
        this.canvas.setPreferredSize(new Dimension(width, height));
        this.backgroundColor = bgColor;
        this.frame.pack();
        this.shapes = new HashMap<Object, Desenhavel>();
        
        Dimension size = this.canvas.getSize();
        this.canvasImage = this.canvas.createImage(size.width, size.height);
        this.graphic = (Graphics2D)this.canvasImage.getGraphics();
        this.graphic.setColor(this.backgroundColor);
        this.graphic.fillRect(0, 0, size.width, size.height);
        this.graphic.setColor(Color.black);
    }

    /**
     * Set the canvas visibility and brings canvas to the front of screen
     * when made visible. This method can also be used to bring an already
     * visible canvas to the front of other windows.
     * @param visible  boolean value representing the desired visibility of
     * the canvas (true or false) 
     */
    public void setVisible(boolean visible)
    {
        this.frame.setVisible(visible);
    }

    /**
     * Draw a given shape onto the canvas.
     * @param  referenceObject  an object to define identity for this shape
     * @param  color            the color of the shape
     * @param  shape            the shape object to be drawn on the canvas
     */
     // Note: this is a slightly backwards way of maintaining the shape
     // objects. It is carefully designed to keep the visible shape interfaces
     // in this project clean and simple for educational purposes.
    public void draw(Object referenceObject, Desenhavel desenhavel)
    {
    	this.shapes.put(referenceObject, desenhavel);
        this.redraw();
    }
 
    /**
     * Erase a given shape's from the screen.
     * @param  referenceObject  the shape object to be erased 
     */
    public void removeShape(Object referenceObject)
    {
    	this.shapes.remove(referenceObject);
    	this.redraw();
    }

    /**
     * Erase the whole canvas. (Does not repaint.)
     */
    private void erase()
    {
        Color original = this.graphic.getColor();
        this.graphic.setColor(this.backgroundColor);
        Dimension size = this.canvas.getSize();
        this.graphic.fill(new Rectangle(0, 0, size.width, size.height));
        this.graphic.setColor(original);
    }


    /**
     * Wait for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number 
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
    }

    /**
     * Redraw ell shapes currently on the Canvas.
     */
    private void redraw()
    {
        this.erase();
        for(Desenhavel shape : this.shapes.values()) {
        	shape.draw(this.graphic);
        }
        this.canvas.repaint();
    }
       


    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }
    
    

}