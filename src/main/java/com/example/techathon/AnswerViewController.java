package com.example.techathon;

import javafx.fxml.FXML;

public class AnswerViewController {
    private NavController navController;
    private SceneManager sceneManager;

    public void setQuestionViewController(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }

    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }
    public void setNavContoller(NavController controller){
        this.navController = controller;
    }


    public void setAnswerVariables(){

    }

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
