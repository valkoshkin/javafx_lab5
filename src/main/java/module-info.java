module com.valkoshkin.javafx_lab5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.valkoshkin.javafx_lab5 to javafx.fxml;
    exports com.valkoshkin.javafx_lab5;
}