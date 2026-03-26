package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


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

    @Override
    public String generateCode(int indent) {
        return("\nSystem.out.println("+message+");\n").indent(indent);
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

        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON
        );
        
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
        g2d.drawString(nombre, 5, alto / 2);
        repaint();
    }
    
    @Override
    public Print copy(){
        Print copy = new Print();
        copy.alto = this.alto;
        copy.largo = this.largo;
        copy.fill = this.fill;
        copy.fuente = this.fuente;
        copy.color = this.color;
        copy.nombre = this.nombre;
        copy.textColor = this.textColor;
        copy.posicion = this.posicion;

        copy.message = this.message;
        return copy;
    }
    
    @Override
    public String Datos() {
        return "Fuente: " + fuente + "\n"
                + "Nombre: " + nombre + "\n"
                + "Color: " + color + "\n"
                + "Color de texto: " + textColor + "\n"
                + "Largo: " + largo + "\n"
                + "Alto: " + alto + "\n"
                + "Relleno: " + fill + "\n"
                + "Mensaje: " + message;
    }
}
