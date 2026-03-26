
package proyectofinalp2_jorgeeuceda;

import java.awt.Point;
import java.io.Serializable;
import javax.swing.tree.TreeNode;

public class ArbolClase extends javax.swing.JTree implements Serializable{
    
    private ClaseUML clase;
    private Point posicion;

    public ArbolClase() {
    }
    
    
    
    public ArbolClase(ClaseUML clase, TreeNode root) {
        super(root);
        this.clase = clase;
    }
    
    public ArbolClase copy(){
        ArbolClase copia = new ArbolClase();
        copia.clase = this.clase.copy();
        copia.posicion = this.posicion;
        return copia;
    }

    public ClaseUML getClase() {
        return clase;
    }

    public void setClase(ClaseUML clase) {
        this.clase = clase;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    
    
    
}
