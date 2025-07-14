package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public class Main extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("/application/LoginScene.fxml"));

        // Create a new scene with the root
        Scene scene = new Scene(root);

        // Add external CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());

        // Optional: Fade-in animation for premium appearance
        FadeTransition fadeIn = new FadeTransition(Duration.millis(700), root);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();

        // Set up the stage
        stage.setTitle("Innobyte Quiz Application");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}