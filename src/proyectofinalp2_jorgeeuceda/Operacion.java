/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Jorge
 */
public class Operacion extends Grafico{
    

    //Parte Logica
    private OperacionTipo tipo;
    private Variable variable1;
    private Variable variable2;
    private Variable resultado;

    public Operacion(){
        
    }
    
    public Operacion(OperacionTipo tipo, Variable variable1, Variable variable2, Variable variable3, Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
        this.tipo = tipo;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.resultado = variable3;
    }
    
    
    public Operacion(Font font, String name, Color color, int width, int height, boolean fill) {
        super(font, name, color, width, height, fill);
    }

    
    @Override
    public String generateCode(int indent) {
        return ("\n"+resultado.getName()+"="+variable1.getName()+tipo.getSimbolo()+variable2.getName()+";\n").indent(indent);
    }

    public OperacionTipo getTipo() {
        return tipo;
    }

    public void setTipo(OperacionTipo tipo) {
        this.tipo = tipo;
    }

    public Variable getVariable1() {
        return variable1;
    }

    public void setVariable1(Variable variable1) {
        this.variable1 = variable1;
    }

    public Variable getVariable2() {
        return variable2;
    }

    public void setVariable2(Variable variable2) {
        this.variable2 = variable2;
    }

    public Variable getResultado() {
        return resultado;
    }

    public void setResultado(Variable resultado) {
        this.resultado = resultado;
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
            g2d.fillRect(3, 3, largo, alto);
        }
        else{
            g2d.drawRect(3, 3, largo, alto);
        }

        //Escribe el texto dentro del triangulo
        g2d.setColor(textColor);
        g2d.setFont(fuente);
        g2d.drawString(nombre, 5, alto/2);
        repaint();
    }
    
    @Override
    public Operacion copy() {
        Operacion copy = new Operacion();
        copy.alto = this.alto;
        copy.largo = this.largo;
        copy.fill = this.fill;
        copy.fuente = this.fuente;
        copy.color = this.color;
        copy.nombre = this.nombre;
        copy.textColor = this.textColor;
        copy.tipo = this.tipo;
        copy.resultado = this.resultado;
        copy.variable1 = this.variable1;
        copy.variable2 = this.variable2;
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
                + "Operacion: " + tipo + "\n"
                + "Variable 1: " + variable1 + "\n"
                + "Variable 2: " + variable2 + "\n"
                + "Resultado: " + resultado;
    }
    
}
