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
        g2d.drawString(nombre, largo/2-nombre.length(), alto/2);
        repaint();
    }
    
    
    
}
