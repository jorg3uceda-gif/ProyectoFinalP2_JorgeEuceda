/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author Jorge
 */
public class Inicio extends Grafico{

    public Inicio() {
    }

    public Inicio(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //Crea el rectangulo
        g2d.setColor(color);
        if (fill) {
            g2d.fillRoundRect(3, 3, largo, alto,50,50);
        } else {
            g2d.drawRoundRect(3, 3, largo, alto, 50, 50);
        }
        //Escribe el texto dentro del triangulo
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, largo / 2 - nombre.length(), alto / 2);
        repaint();
    }

    
}
