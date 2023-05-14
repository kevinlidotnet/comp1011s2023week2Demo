module com.example.demoweek2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoweek2 to javafx.fxml;
    exports com.example.demoweek2;
}