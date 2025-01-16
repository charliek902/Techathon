package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CalculatorController {
    @FXML
    private TextField amountField;
    @FXML
    private TextField timeField;
    @FXML
    private Label ISAOutputLabel;

    private NavController navController;
    private SceneManager sceneManager;
    private ToggleGroup group;

    @FXML
    private RadioButton growthISACheckBoxOption1;
    @FXML
    private RadioButton growthISACheckBoxOption2;
    @FXML
    private RadioButton growthISACheckBoxOption3;

    double ISAInterest;

    @FXML
    public void initialize() {
        // Grouping the radio buttons
        group = new ToggleGroup();
//        growthISACheckBoxOption1.setToggleGroup(group);
//        growthISACheckBoxOption2.setToggleGroup(group);
//        growthISACheckBoxOption3.setToggleGroup(group);
    }
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

        // Determine the ISAInterest based on the selected radio button
        RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
        if (selectedRadioButton == growthISACheckBoxOption1) {
            ISAInterest = 2;
        } else if (selectedRadioButton == growthISACheckBoxOption2) {
            ISAInterest = 5;
        } else if (selectedRadioButton == growthISACheckBoxOption3) {
            ISAInterest = 8;
        }

        double result = amount * ((ISAInterest / 100) + 1) * time;
        ISAOutputLabel.setText("£" + result);
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
    protected void onNotesButtonClick() throws IOException {
        this.navController.onNotesButtonClick();
    }
}