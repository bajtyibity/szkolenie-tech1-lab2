module com.mycompany.lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab2 to javafx.fxml;
    exports com.mycompany.lab2;
}
