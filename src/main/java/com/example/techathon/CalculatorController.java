package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField amountField;
    @FXML
    private TextField timeField;

    private NavController navController;

    private SceneManager sceneManager;

    double ISAInterest = 2;

    public void setNavContoller(NavController navController) {
        this.navController = navController;
    }
    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }

    @FXML
    private void handleISACalculate() {
        double amount = Double.parseDouble(amountField.getText());
        short time = Short.parseShort(timeField.getText());
        double result = amount * ((ISAInterest / 100) + 1) * time;
    }

    @FXML
    private void handlePensionCalculate() {
        double amount = Double.parseDouble(amountField.getText());
        short time = Short.parseShort(timeField.getText());
    }

    @FXML
    private void handleMortgageCalculate() {
        double amount = Double.parseDouble(amountField.getText());
        short time = Short.parseShort(timeField.getText());
        double result = time*amount;
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
    protected void onNotesButtonClick() {
        this.navController.onNotesButtonClick();
    }
}

