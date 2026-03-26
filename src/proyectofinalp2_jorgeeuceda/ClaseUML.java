package proyectofinalp2_jorgeeuceda;

import java.io.Serializable;
import java.util.ArrayList;

    public class ClaseUML implements Serializable {
    
    private String nombre;
    private ArrayList<Metodo> metodos = new ArrayList<>();
    private ArrayList<Atributo> atributos = new ArrayList<>();
    private ClaseUML padre;

    public ClaseUML() {
    }
    
    public ClaseUML(String nombre) {
        this.nombre = nombre;
    }
    
    public ClaseUML(String nombre, ClaseUML padre) {
        this.nombre = nombre;
        this.padre = padre;
    }

    public String generateCode(){
        String code = "";
        
        //El inicio de la clase
        if (padre==null) {
            code += "public class " + nombre + "{\n";
        }
        else{
            code += "public class " + nombre +" extends "+padre.getNombre() +"{\n";
        }
        
        //Los atributos
        for (Atributo atributo : atributos) {
            code+=(atributo.getAlcance()+" "+atributo.getType()+" "+atributo.getName()+";\n").indent(4);
        }
        
        //Los metodos
        for (Metodo metodo: metodos) {
            String parametros ="";
            for (Variable parametro : metodo.getParametros()) {
                parametros+=(parametro.getType()+" "+parametro.getName()+" ,");
            }
            parametros = parametros.substring(0, parametros.lastIndexOf(","));
            code+=(metodo.getAlcance()+" "+metodo.getTipoReturn()+" "+metodo.getNombre()+"("+parametros+"){\n\n}").indent(4);
        }

        //El Final
        code+="}";
        
        return code;
    }
    
    public ClaseUML copy(){
        ClaseUML copia = new ClaseUML();
        copia.nombre = this.nombre;
        copia.atributos = new ArrayList<Atributo>();
        for (Atributo atributo : this.atributos) {
            copia.atributos.add(atributo);
        }
        copia.metodos = new ArrayList<Metodo>();
        for (Metodo metodo: this.metodos) {
            copia.metodos.add(metodo);
        }
        if (this.padre != null) {
            copia.padre = padre.copy();
        }

        return copia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public ClaseUML getPadre() {
        return padre;
    }

    public void setPadre(ClaseUML padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
