package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class CalculatorController {
    private SceneManager sceneManager;
    private NavController navController;

    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }
    public void setNavContoller(NavController controller){
        this.navController = controller;
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

    @FXML
    protected void onISAButtonClick() {
//        sceneManager.getScene()
//        sceneManager.applyStage();
    }
    @FXML
    protected void onPensionsButtonClick() {

    }
    @FXML
    protected void onMortgageButtonClick(){
        System.out.println("Mortgage");
    }

}
