package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.UserSession;

public class ResultScene {

    @FXML
    private Label congratsLabel, scoreLabel;

    @FXML
    public void initialize() {
        String name = UserSession.getUsername();
        int score = UserSession.getScore();
        congratsLabel.setText("🎉 Congrats, " + name + "!");
        scoreLabel.setText("You scored: " + score + " / 10");
    }

    @FXML
    private void handleRestart() {
        try {
            UserSession.resetScore();
            Parent loginRoot = FXMLLoader.load(getClass().getResource("/application/LoginScene.fxml"));
            Scene loginScene = new Scene(loginRoot);
            loginScene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());
            Main.primaryStage.setScene(loginScene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }
}
