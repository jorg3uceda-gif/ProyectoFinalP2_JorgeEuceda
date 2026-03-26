package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class For extends Grafico{
    
    private String init;
    private String condicion;
    private String actualizar;
    private boolean inicio;

    public For(){
        
    }

    public For(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }
    
    public For(boolean inicio, String init, String condicion, String actualizar, Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
        this.inicio = inicio;
        this.init = init;
        this.condicion = condicion;
        this.actualizar = actualizar;
    }
    @Override
    public String generateCode(int indent) {
        if (inicio) {
            return ("\nfor("+init+";"+condicion+";"+actualizar+"){\n").indent(indent);
        }
        else{
            return """
                   }
                   """.indent(indent);
        }
    }
    
    public boolean isInicio() {
        return inicio;
    }

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }
    
    
    
    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getActualizar() {
        return actualizar;
    }

    public void setActualizar(String actualizar) {
        this.actualizar = actualizar;
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
        
        int[] puntosX = {0,largo-5,largo,5};
        int[] puntosY = {alto, alto, 3, 3};

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
    public For copy() {
        For copy = new For();
        copy.alto = this.alto;
        copy.largo = this.largo;
        copy.fill = this.fill;
        copy.fuente = this.fuente;
        copy.color = this.color;
        copy.nombre = this.nombre;
        copy.textColor = this.textColor;
        copy.init = this.init;
        copy.condicion = this.condicion;
        copy.actualizar = this.actualizar;
        copy.inicio = this.inicio;
        copy.posicion = this.posicion;

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
                + "Inicializador: "+ init + "\n"
                + "Condicion: "+ condicion + "\n"
                + "Actualizador: "+ actualizar +"\n"
                + "Inicio: "+inicio;
    }
    
    
}
