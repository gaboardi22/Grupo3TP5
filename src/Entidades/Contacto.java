
package Entidades;

/**
 *
 * @author GRUPO 3
 */
public class Contacto {
    private int dni;
    private String apellido;
    private String nombre;
    private String ciudad;
    private String direccion;
    

    public Contacto(int dni, String apellido, String nombre, String ciudad, String direccion) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Contacto{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", ciudad=" + ciudad + ", direccion=" + direccion  + '}';
    }
    
    
}
