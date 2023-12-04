module com.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.VisualProject to javafx.fxml;
    exports com.example.VisualProject;
}