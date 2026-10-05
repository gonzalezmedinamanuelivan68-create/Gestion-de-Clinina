package edu.utj.dsm.poo.clinica.modelo;



/**
 * 
 */
public class Medico extends Persona {

    /**
     * Default constructor
     */
    public Medico() {
    }

    /**
     * 
     */
    private String numeroColegiado;

    /**
     * 
     */
    private int añosExperiencia;

    /**
     * 
     */
    private String imagenFirmaDigital;

    /**
     * 
     */
    private String estadoDisponibilidad;




    /**
     * @return
     */
    public String getNumeroColegiado() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setNumeroColegiado(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getAñosExperiencia() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setAñosExperiencia(int value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getImagenFirmaDigital() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setImagenFirmaDigital(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getEstadoDisponibilidad() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setEstadoDisponibilidad(String value) {
        // TODO implement here
    }
    /**
     * Devuelve el estado completo del médico.
     *
     * @return representación textual del médico.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Medico: " +
                "Numero Colegiado: " + numeroColegiado +
                "Años Experiencia: + añosExperiencia" +
                "Imagen Firma Digital: " + imagenFirmaDigital +
                "Estado Disponibilidad: " + estadoDisponibilidad;
    }

}