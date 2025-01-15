package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;


/*

        sceneManager.addScene(welcomeScene, "welcome");
        sceneManager.addScene(calculatorScene, "calculator");
        sceneManager.addScene(learnScene, "learn");
        sceneManager.addScene(quizScene, "quiz");

 */




public class HelloController {
    private SceneManager sceneManager;
    private NavController navController;

    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }
    public void setNavContoller(NavController controller){
        this.navController = controller;
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        this.navController.onHomeButtonClick();
    }
    @FXML
    protected void onLearnButtonClick() {
        this.navController.onLearnButtonClick();
    }
    @FXML
    protected void onQuizButtonClick() {
        this.navController.onQuizButtonClick();
    }
    @FXML
    protected void onCalculatorButtonClick() {
        this.navController.onCalculatorButtonClick();
    }

}