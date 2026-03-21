package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Fin extends Grafico{

    public Fin() {
    }

    public Fin(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //Crea el rectangulo
        g2d.setColor(color);
        if (fill) {
            g2d.fillRoundRect(3, 3, largo, alto, 50, 50);
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
