package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.scene.layout.Panel;

public class chooseCalculatorController {
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
        sceneManager.applyStage(sceneManager.getScene("ISA-calculator"),"ISA");

    }
    @FXML
    protected void onPensionsButtonClick() {
        sceneManager.applyStage(sceneManager.getScene("pension-calculator"),"Pension");
    }
    @FXML
    protected void onMortgageButtonClick(){
        sceneManager.applyStage(sceneManager.getScene("mortgage-calculator"),"Mortgage");

    }


}
