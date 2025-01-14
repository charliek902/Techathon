module com.example.techathon {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.techathon to javafx.fxml;
    exports com.example.techathon;
}