package proyectofinalp2_jorgeeuceda;

public class Variable {
    
    String name;
    String type;
    String alcance;

    public Variable(String name, String type, String alcance) {
        this.name = name;
        this.type = type;
        this.alcance = alcance;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "("+type+")"+" "+name;
    }
    
    
    
}