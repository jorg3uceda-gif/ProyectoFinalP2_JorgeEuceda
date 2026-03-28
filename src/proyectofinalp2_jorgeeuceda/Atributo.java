package proyectofinalp2_jorgeeuceda;

import java.io.Serializable;

public class Atributo extends Variable implements Serializable{
    
    private String alcance;

    public Atributo(String name, String type, String alcance) {
        super(name, type);
        this.alcance = alcance;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
    
}
