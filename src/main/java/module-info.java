module com.desafio {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.desafio to javafx.fxml;
    exports com.desafio;
}
