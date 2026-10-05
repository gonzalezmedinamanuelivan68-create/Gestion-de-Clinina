package edu.utj.dsm.poo.clinica.modelo;

import java.util.Date;



/**
 * 
 */
public class Paciente extends Persona {

    /**
     * Default constructor
     */
    public Paciente() {
    }

    /**
     * 
     */
    private String imagenIdentificacion;

    /**
     * 
     */
    private String estadoClinico;

    /**
     * 
     */
    private String tipoSangre;

    /**
     * 
     */
    private Date fechaNacimiento;




    /**
     * @return
     */
    public String getImagenIdentificacion() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setImagenIdentificacion(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEstadoClinico() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setEstadoClinico(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getTipoSangre() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setTipoSangre(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Date getFechaNacimiento() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setFechaNacimiento(Date value) {
        // TODO implement here
    }
     /**
     * Devuelve el estado completo del paciente.
     *
     * @return representación textual del paciente.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Paciente: " +
                "tipoSangre: " + tipoSangre +
                "fechaNacimiento: " + fechaNacimiento +
                "magenIdentificacion" +
                imagenIdentificacion +
                "estadoClinico: " + estadoClinico;
    }

}