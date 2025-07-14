package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.UserSession;

public class LoginScene {

    @FXML
    private TextField nameField;

    @FXML
    private void handleStartQuiz() {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING, "Please enter your name!");
            alert.show();
        } else {
            UserSession.setUsername(name);
            try {
                Parent quizRoot = FXMLLoader.load(getClass().getResource("/application/QuizScene.fxml"));
                Scene quizScene = new Scene(quizRoot);
                quizScene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());
                Main.primaryStage.setScene(quizScene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
