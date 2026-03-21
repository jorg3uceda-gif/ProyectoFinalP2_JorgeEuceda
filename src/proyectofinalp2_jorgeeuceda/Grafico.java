/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Jorge
 */
public abstract class Grafico extends javax.swing.JPanel{
    
    //Parte Visual
    protected Font fuente;
    protected String nombre;
    protected Color color;
    protected Color textColor;
    protected int largo;
    protected int alto;
    protected boolean fill;

    public Grafico(){        
        
    }
    
    public Grafico(Font font, String name, Color color, int width, int height, boolean fill) {
        this.fuente = font;
        this.nombre = name;
        this.color = color;
        this.largo = width;
        this.alto = height;
        this.fill = fill;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
        repaint();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    
    
}
