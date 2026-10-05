package edu.utj.dsm.poo.clinica.modelo;

import java.util.Objects;



/**
 * @author Gonzalez Medina Manuel Ivan
 */
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    protected String telefono;
    protected String imagenPerfil;
    protected String idPersona;
    protected String estadoRegistro;
    

    /**
     * Default constructor
     */
    public Persona() {
    }

    /**
     * @return
     */
    public String getImagenPerfil() {
        // TODO implement here
        return "";
    }

    /**
     * @param dato
     */
    public void setImagenPerfil(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getIdPersona() {
        // TODO implement here
        return 0;
    }

    /**
     * @param dato
     */
    public void setIdPersona(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEstadoRegistro() {
        // TODO implement here
        return "";
    }

    /**
     * @param dato
     */
    public void setEstadoRegistro(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @param dato
     */
    public void setNombre(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getApellidos() {
        // TODO implement here
        return "";
    }

    /**
     * @param dato
     */
    public void setApellidos(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getTelefono() {
        // TODO implement here
        return 0;
    }

    /**
     * @param dato
     */
    public void setTelefono(int dato) {
        // TODO implement here
    }
     @Override
     public boolean equals(Object obj){
         if (this == obj){
             return true;
         }
         if (obj == null){
             return false;
         }
         if (getClass() != obj.getClass()){
             return false;
         }
         final Persona other = (Persona) obj;
         return Objects.equals(this.idPersona, other.idPersona);
     }

    @Override
    public String toString() {
        return "Persona{" + "id: " + idPersona + ", nombre: " + nombre +
                "Telefono: " + telefono + "ImagenPerfil: " + imagenPerfil + "Estado Registro: " + estadoRegistro;
    }
    
    
    

}