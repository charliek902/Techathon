package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private SceneManager sceneManager;

    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }




    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onLearnButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onQuizButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onCalculatorButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}