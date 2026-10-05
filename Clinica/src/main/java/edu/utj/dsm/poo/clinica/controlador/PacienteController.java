package edu.utj.dsm.poo.clinica.controlador;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
/**
 *
 * @author Gonzalez Medina Manuel Ivan
 */
public class PacienteController {
   
    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private ComboBox<String> cbEstado;
    @FXML private ImageView imgFirma;
    @FXML private TableView<?> tablaMedicos; 
    
    @FXML
    public void initialize() {
        cbEstado.getItems().addAll("Disponible", "En Consulta", "Fuera de Turno", "Inactivo");
    }

   
    @FXML
    public void guardarMedico(ActionEvent event) {
        String id = txtId.getText();
        String nombre = txtNombre.getText();
        String estado = cbEstado.getValue();
        
        System.out.println("Guardando médico: " + nombre + " - " + estado);
    }
    
    @FXML
    public void cargarImagen(ActionEvent event) {
    }
}   

