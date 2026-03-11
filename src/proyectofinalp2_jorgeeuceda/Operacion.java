/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Jorge
 */
public class Operacion extends javax.swing.JPanel{
    
    //Parte Visual
    private Font fuente;
    private String nombre;
    private Color color;
    private Color textColor;
    private int largo;
    private int alto;

    //Parte Logica
    private OperacionTipo tipo;
    private Number variable1;
    private Number variable2;

    public Operacion(Font font, String name, Color color, Color textColor, int width, int height, OperacionTipo tipo, Number variable1, Number variable2) {
        this.fuente = font;
        this.nombre = name;
        this.color = color;
        this.textColor = textColor;
        this.largo = width;
        this.alto = height;
        this.tipo = tipo;
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
    
    public Operacion(Font font, String name, Color color, int width, int height) {
        this.fuente = font;
        this.nombre = name;
        this.color = color;
        this.largo = width;
        this.alto = height;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font font) {
        this.fuente = font;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int width) {
        this.largo = width;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int height) {
        this.alto = height;
    }

    public OperacionTipo getTipo() {
        return tipo;
    }

    public void setTipo(OperacionTipo tipo) {
        this.tipo = tipo;
    }

    public Number getVariable1() {
        return variable1;
    }

    public void setVariable1(Number variable1) {
        this.variable1 = variable1;
    }

    public Number getVariable2() {
        return variable2;
    }

    public void setVariable2(Number variable2) {
        this.variable2 = variable2;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //Crea el rectangulo
        g2d.setColor(color);
        g2d.drawRect(0, 0, largo, alto);

        //Escribe el texto dentro del triangulo
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, largo/2, alto/2);
        repaint();
    }
    
    
    
}
