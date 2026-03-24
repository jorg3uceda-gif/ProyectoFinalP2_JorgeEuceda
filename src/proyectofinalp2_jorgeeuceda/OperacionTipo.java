/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyectofinalp2_jorgeeuceda;

/**
 *
 * @author Jorge
 */
public enum OperacionTipo {
    
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/");
    
    private final String simbolo;

    private OperacionTipo(String symbol) {
        this.simbolo = symbol;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
}
