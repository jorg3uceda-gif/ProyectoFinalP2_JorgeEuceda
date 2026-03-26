package proyectofinalp2_jorgeeuceda;

import java.util.ArrayList;

public class Metodo {
    
    private String nombre;
    private String tipoReturn;
    private String alcance;
    private ArrayList<Variable> parametros;

    public Metodo(String nombre, String tipoReturn, String alcance, ArrayList<Variable> parametros) {
        this.nombre = nombre;
        this.tipoReturn = tipoReturn;
        this.alcance = alcance;
        this.parametros = parametros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoReturn() {
        return tipoReturn;
    }

    public void setTipoReturn(String tipoReturn) {
        this.tipoReturn = tipoReturn;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public ArrayList<Variable> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Variable> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "("+tipoReturn+") "+nombre;
    }
    
    
    
}
