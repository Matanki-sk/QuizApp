package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.util.Duration;
import model.Question;
import model.UserSession;
import util.QuestionBank;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.List;

public class QuizScene implements Initializable {

    @FXML private Label questionLabel, timerLabel;
    @FXML private RadioButton option1, option2, option3, option4;
    @FXML private Button nextButton;

    private ToggleGroup toggleGroup = new ToggleGroup();
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int timeLeft = 30;
    private Timeline timeline;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        option1.setToggleGroup(toggleGroup);
        option2.setToggleGroup(toggleGroup);
        option3.setToggleGroup(toggleGroup);
        option4.setToggleGroup(toggleGroup);

        questions = QuestionBank.getQuestions();
        loadQuestion();

        toggleGroup.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            nextButton.setDisable(newVal == null);
        });

        startTimer();
    }

    private void loadQuestion() {
        if (currentQuestionIndex >= questions.size()) {
            goToResult();
            return;
        }

        Question q = questions.get(currentQuestionIndex);
        questionLabel.setText("Q" + (currentQuestionIndex + 1) + ": " + q.getQuestion());
        option1.setText(q.getOptions()[0]);
        option2.setText(q.getOptions()[1]);
        option3.setText(q.getOptions()[2]);
        option4.setText(q.getOptions()[3]);
        toggleGroup.selectToggle(null);
        nextButton.setDisable(true);
        timeLeft = 30;
    }

    private void startTimer() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            timeLeft--;
            timerLabel.setText("⏱ " + timeLeft + "s");
            if (timeLeft <= 0) {
                timeline.stop();
                handleNext();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    private void handleNext() {
        timeline.stop(); // Stop current timer

        RadioButton selected = (RadioButton) toggleGroup.getSelectedToggle();
        if (selected != null) {
            String answer = selected.getText();
            Question q = questions.get(currentQuestionIndex);
            if (answer.equals(q.getCorrectAnswer())) {
                UserSession.incrementScore();
            }
        }

        currentQuestionIndex++;
        if (currentQuestionIndex < questions.size()) {
            loadQuestion();
            startTimer();
        } else {
            goToResult();
        }
    }

    private void goToResult() {
        try {
            Parent resultRoot = FXMLLoader.load(getClass().getResource("/application/ResultScene.fxml"));
            Scene resultScene = new Scene(resultRoot);
            resultScene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());
            Main.primaryStage.setScene(resultScene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
