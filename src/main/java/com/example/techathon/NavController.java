package com.example.techathon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class NavController {
    private SceneManager sceneManager;

    public NavController(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }

    protected void onHomeButtonClick() {
        Scene homeScene = this.sceneManager.getScene("welcome");
        this.sceneManager.applyStage(homeScene, "Welcome");
    }

    protected void onLearnButtonClick() {
        Scene learningScene = this.sceneManager.getScene("learn");
        this.sceneManager.applyStage(learningScene, "Learning");
    }

    protected void onQuizButtonClick() {
        Scene quizScene = this.sceneManager.getScene("quiz");
        this.sceneManager.applyStage(quizScene, "Quizes");
    }

    protected void onCalculatorButtonClick() {
        Scene calculatorScene = this.sceneManager.getScene("calculator");
        this.sceneManager.applyStage(calculatorScene, "CalculatorController");
    }

    protected void onNotesButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/techathon/notes.fxml"));
        Scene scene = new Scene(loader.load());
        NotesViewController controller = loader.getController();
        controller.loadNotes();
        Scene notes = this.sceneManager.getScene("notes");
        this.sceneManager.applyStage(notes, "Notes");
    }
}
