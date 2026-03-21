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
public class While extends Grafico{
    
    String condicion;
    boolean inicio;

    public While() {
    }

    public While(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }

    public While(boolean inicio, Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
        this.inicio = inicio;
    }

    public While(String condicion, boolean inicio, Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
        this.condicion = condicion;
        this.inicio = inicio;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public boolean isInicio() {
        return inicio;
    }

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int[] puntosX = {largo / 2, largo, largo / 2, 0};
        int[] puntosY = {0, alto / 2, alto, alto / 2};

        //Crea el diamante
        g2d.setColor(color);
        if (fill) {
            g2d.fillPolygon(puntosX, puntosY, 4);
        } else {
            g2d.drawPolygon(puntosX, puntosY, 4);
        }

        //Escribe el texto dentro del triangulo
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, largo / 2 - nombre.length(), alto / 2);
        repaint();
    }
}
