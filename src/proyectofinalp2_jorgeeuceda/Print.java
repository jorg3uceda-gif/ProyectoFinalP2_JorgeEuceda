package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Print extends Grafico{
    
    private String message;

    public Print() {
        
    }

    public Print(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }

      
    public Print(String message, Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int[] puntosX = {0,largo-5,largo,0+5};
        int[] puntosY = {0, 0, alto-3, alto-3};

        //Crea el diamante
        g2d.setColor(color);
        if (fill) {
            g2d.fillPolygon(puntosX, puntosY, 4);
        } else {
            g2d.drawPolygon(puntosX, puntosY, 4);
        }

        //Escribe el texto dentro del diamante
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, largo / 2 - nombre.length(), alto / 2);
        repaint();
    }
    
}
