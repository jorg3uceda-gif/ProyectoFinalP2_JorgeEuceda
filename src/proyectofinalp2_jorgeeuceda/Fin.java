package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Fin extends Grafico{

    public Fin() {
    }

    public Fin(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }
    
    @Override
    public String generateCode(int indent){
        return """
                   }
               }
               """;
    }
    
    @Override
    public Fin copy() {
        Fin copy = new Fin();
        copy.alto = this.alto;
        copy.largo = this.largo;
        copy.fill = this.fill;
        copy.fuente = this.fuente;
        copy.color = this.color;
        copy.nombre = this.nombre;
        copy.textColor = this.textColor;

        return copy;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        //Hace mas suaves las lineas
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
            g2d.fillRoundRect(3, 3, largo, alto, 70, 70);
        } else {
            g2d.drawRoundRect(3, 3, largo, alto, 70, 70);
        }
        //Escribe el texto dentro del triangulo
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, 5, alto / 2);
        repaint();
    }
    
    
}
