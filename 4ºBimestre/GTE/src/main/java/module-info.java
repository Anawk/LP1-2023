module com.example.gte {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gte to javafx.fxml;
    exports com.example.gte;
}