module com.oliemanq.javafxlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oliemanq.javafxlab to javafx.fxml;
    exports com.oliemanq.javafxlab;
}