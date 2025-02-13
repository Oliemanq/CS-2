package com.oliemanq.javafxlab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello!");
        Pane setOfUIElements = new Pane();
        Scene sceneNew = new Scene(setOfUIElements, 600, 400);
        VBox vBox = new VBox();
        HBox hBox = new HBox();


        Label helloLabel = new Label("Hello");
        TextField nameField = new TextField();
        Button button = new Button();
        button.setText("Set new name");
        button.setOnAction(event -> {
            helloLabel.setText("Hello " + nameField.getText());
        });
        nameField.setPromptText("Enter your name");
        vBox.getChildren().add(nameField);
        vBox.getChildren().add(button);

        hBox.getChildren().add(helloLabel);
        hBox.getChildren().add(vBox);

        vBox.setSpacing(10);
        hBox.setSpacing(10);
        hBox.setAlignment(javafx.geometry.Pos.CENTER);

        setOfUIElements.getChildren().add(hBox);
        stage.setScene(sceneNew);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}