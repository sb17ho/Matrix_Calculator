package CalculatorGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MethodSelect.fxml")));
        primaryStage.setTitle("Method Select");
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
