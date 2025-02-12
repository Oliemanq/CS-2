module com.oliemanq.javafxinclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oliemanq.javafxinclass to javafx.fxml;
    exports com.oliemanq.javafxinclass;
}