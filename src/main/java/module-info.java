module com.mycompany.pharmacie {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.pharmacie to javafx.fxml;
    exports com.mycompany.pharmacie;
}
