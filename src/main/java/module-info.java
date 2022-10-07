module com.example.proyectoiconosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectoiconosfx to javafx.fxml;
    exports com.example.proyectoiconosfx;
}