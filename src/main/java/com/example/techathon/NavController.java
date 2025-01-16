package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.Scene;

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

    protected void onNotesButtonClick() {
        Scene notes = this.sceneManager.getScene("notes");
        this.sceneManager.applyStage(notes, "Notes");
    }
}
