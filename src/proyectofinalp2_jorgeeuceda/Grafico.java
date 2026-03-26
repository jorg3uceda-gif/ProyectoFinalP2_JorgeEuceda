/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Jorge
 */
public abstract class Grafico extends javax.swing.JPanel implements Serializable{
    
    //Parte Visual
    protected Font fuente;
    protected String nombre;
    protected Color color;
    protected Color textColor;
    protected int largo;
    protected int alto;
    protected boolean fill;
    protected Point posicion;

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

    public abstract String generateCode(int indent);
    
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

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }


    
    
    
    public abstract Grafico copy();
    
    public String Datos() {
        return "Fuente: " + fuente + "\n"
                + "Nombre: " + nombre + "\n"
                + "Color: " + color + "\n"
                + "Color de texto: " + textColor + "\n"
                + "Largo: " + largo + "\n"
                + "Alto: " + alto + "\n"
                + "Relleno: " + fill;    
    }
    
}
