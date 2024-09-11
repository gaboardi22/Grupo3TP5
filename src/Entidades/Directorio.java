
package Entidades;

import java.util.TreeMap;

/**
 *
 * @author GRUPO 3
 */
public class Directorio {
    TreeMap<Long, Contacto> directorio;

    public Directorio() {
        directorio = new TreeMap<>();
    }

    public TreeMap<Long, Contacto> getDirectorio() {
        return directorio;
    }

    public void setDirectorio(TreeMap<Long, Contacto> directorio) {
        this.directorio = directorio;
    }

    @Override
    public String toString() {
        return "Directorio{" + "directorio=" + directorio + '}';
    }
    
    
    public void agregarContacto(){
       
    }
}
