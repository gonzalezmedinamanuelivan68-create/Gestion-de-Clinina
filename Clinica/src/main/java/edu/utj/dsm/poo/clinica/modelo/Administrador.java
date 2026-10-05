package edu.utj.dsm.poo.clinica.modelo;

import java.util.Date;




/**
 * @author Gonzalez Medina Manuel Ivan
 */
public class Administrador extends Persona {

    /**
     * Default constructor
     */
    public Administrador() {
    }
    protected String imagenCredencial;
    protected String rolAdmin;
    protected Date fechaContratacion;
    protected String estadoSesion;



    /**
     * @return
     */
    public String getImagenCredencial() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setImagenCredencial(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getRolAdmin() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setRolAdmin(String dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Date getFechaContratacion() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFechaContratacion(Date dato) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEstadoSesion() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setEstadoSesion(String dato) {
        // TODO implement here
    }
        /**
     * Devuelve el estado completo del administrador.
     *
     * @return representación textual del administrador.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Administrador: " +
                "Rol Admin: " + rolAdmin +
                "Fecha Contratacion: " + fechaContratacion +
                "Imagen Credencial: " +
                imagenCredencial +
                "Estado Sesion=" + estadoSesion;
    }

    

}