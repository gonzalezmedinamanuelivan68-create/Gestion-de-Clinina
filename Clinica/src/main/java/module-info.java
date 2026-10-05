module com.mycompany.clinica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.utj.dsm.poo.clinica to javafx.fxml;
    exports edu.utj.dsm.poo.clinica;
}
