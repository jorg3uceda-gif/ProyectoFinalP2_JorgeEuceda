package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Inicio extends Grafico{

    public Inicio() {
    }

    public Inicio(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }
    
    @Override
    public String generateCode(int indent) {
        return"package codigo;\n"
                + "public class Codigo{\n"
                + "    public static void main (String[] args){\n";
    }
    
    @Override
    public Inicio copy() {
        Inicio copy = new Inicio();
        copy.alto = this.alto;
        copy.largo = this.largo;
        copy.fill = this.fill;
        copy.fuente = this.fuente;
        copy.color = this.color;
        copy.nombre = this.nombre;
        copy.textColor = this.textColor;
        copy.posicion = this.posicion;
        return copy;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );
        
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
        g2d.drawString(nombre, 5, alto / 2);
        repaint();
    }

    
}
