
package Entidades;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author GRUPO 3
 */
public class Directorio {
     private static TreeMap<Long, Contacto> directorio;

    public Directorio() {
        directorio = new TreeMap<>();
    }

    public TreeMap<Long, Contacto> getDirectorio() {
        return directorio;
    }

    public void setDirectorio(TreeMap<Long, Contacto> directorio) {
        Directorio.directorio = directorio;
    }

    @Override
    public String toString() {
        return "Directorio{" + "directorio=" + directorio + '}';
    }
    
    
    public void agregarContacto( Long telefono, Contacto contacto){
        if(!directorio.containsKey(telefono)){
            directorio.put(telefono, contacto);
        }
    }
    
    public Contacto buscarContacto(Long telefono){
      Contacto contacto =  directorio.get(telefono);
      return contacto;
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
    
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto cliente : directorio.values()) {
            if (cliente.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosCiudad.add(cliente);
            }
        }
        return contactosCiudad;
    }
    
     public void borrarContacto(Long telefono) {
        directorio.remove(telefono);
    }
}
    
    

