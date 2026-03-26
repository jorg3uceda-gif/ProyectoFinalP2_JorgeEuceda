
package proyectofinalp2_jorgeeuceda;

import java.awt.Point;
import javax.swing.tree.TreeNode;

public class ArbolClase extends javax.swing.JTree{
    
    private ClaseUML clase;
    private Point posicion;
    
    public ArbolClase(ClaseUML clase, TreeNode root) {
        super(root);
        this.clase = clase;
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
