package proyectofinalp2_jorgeeuceda;

public class Atributo extends Variable{
    
    private String alcance;

    public Atributo(String alcance, String name, String type) {
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
