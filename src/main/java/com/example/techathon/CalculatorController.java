package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CalculatorController {

    //>ISA view components
    @FXML
    private TextField amountField;
    @FXML
    private TextField timeField;
    @FXML
    private Label ISAOutputLabel;

    //>Budgeting view components
    //>>Income
    @FXML
    private TextField salaryField;
    @FXML
    private TextField rentField;
    @FXML
    private TextField pensionsField;
    @FXML
    private TextField investmentsField;
    @FXML
    private TextField universalCreditField;
    @FXML
    private TextField additionalIncomeField;
    //>>Bills
    @FXML
    private TextField mortgageCostField;
    @FXML
    private TextField rentCostField;
    @FXML
    private TextField utilitiesCostField;
    @FXML
    private TextField lifeInsuranceCostField;
    @FXML
    private TextField councilTaxField;
    @FXML
    private TextField broadbandCostField;
    //>>Living Costs
    @FXML
    private TextField groceriesCostField;
    @FXML
    private TextField deliveryCostField;
    @FXML
    private TextField alcoholCostField;
    @FXML
    private TextField travelCostField;
    @FXML
    private TextField clothingCostField;
    @FXML
    private TextField toiletriesCostField;
    //>>Leisure
    @FXML
    private TextField daysOutCostField;
    @FXML
    private TextField subscriptionsCostField;
    @FXML
    private TextField hobbiesCostField;
    @FXML
    private TextField celebrationsCostField;
    @FXML
    private TextField holidaysCostField;
    //>>result and summary
    @FXML
    private Label totalIncomeLabel;
    @FXML
    private Label totalCostLabel;
    @FXML
    private Label budgetResultLabel;



    private NavController navController;
    private SceneManager sceneManager;
    private ToggleGroup radioGroup;

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
        radioGroup = new ToggleGroup();
    }
    public void setNavContoller(NavController navController) {
        this.navController = navController;
    }
    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }




    @FXML
    private void handleISACalculate() {
        double amount = Double.parseDouble(this.amountField.getText());
        short time = Short.parseShort(this.timeField.getText());
        RadioButton selectedRadioButton = (RadioButton)this.radioGroup.getSelectedToggle();
        if (selectedRadioButton == this.growthISACheckBoxOption1) {
            this.ISAInterest = (double)2.0F;
        } else if (selectedRadioButton == this.growthISACheckBoxOption2) {
            this.ISAInterest = (double)5.0F;
        } else if (selectedRadioButton == this.growthISACheckBoxOption3) {
            this.ISAInterest = (double)8.0F;
        }

        double result = amount * (this.ISAInterest / (double)100.0F + (double)1.0F) * (double)time;
        this.ISAOutputLabel.setText("£" + result);
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
    private void handleBudgetCalculate() {
        double income = 0;
        double expenses = 0;
        try {
            // Calculate total income
            income += parseDoubleNullIsZero(salaryField.getText());
            income += parseDoubleNullIsZero(rentField.getText());
            income += parseDoubleNullIsZero(pensionsField.getText());
            income += parseDoubleNullIsZero(investmentsField.getText());
            income += parseDoubleNullIsZero(universalCreditField.getText());
            income += parseDoubleNullIsZero(additionalIncomeField.getText());

            // Calculate total expenses
            expenses += parseDoubleNullIsZero(mortgageCostField.getText());
            expenses += parseDoubleNullIsZero(rentCostField.getText());
            expenses += parseDoubleNullIsZero(utilitiesCostField.getText());
            expenses += parseDoubleNullIsZero(lifeInsuranceCostField.getText());
            expenses += parseDoubleNullIsZero(councilTaxField.getText());
            expenses += parseDoubleNullIsZero(broadbandCostField.getText());
            expenses += parseDoubleNullIsZero(groceriesCostField.getText());
            expenses += parseDoubleNullIsZero(deliveryCostField.getText());
            expenses += parseDoubleNullIsZero(alcoholCostField.getText());
            expenses += parseDoubleNullIsZero(travelCostField.getText());
            expenses += parseDoubleNullIsZero(clothingCostField.getText());
            expenses += parseDoubleNullIsZero(toiletriesCostField.getText());
            expenses += parseDoubleNullIsZero(daysOutCostField.getText());
            expenses += parseDoubleNullIsZero(subscriptionsCostField.getText());
            expenses += parseDoubleNullIsZero(hobbiesCostField.getText());
            expenses += parseDoubleNullIsZero(celebrationsCostField.getText());
            expenses += parseDoubleNullIsZero(holidaysCostField.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        totalIncomeLabel.setText("£" + income);
        totalCostLabel.setText("£" + expenses);

        double remainingBudget = income - expenses;
        budgetResultLabel.setText("£" + remainingBudget);
    }

    //Custom parsing method for text fields when they are null to make them 0.
    private double parseDoubleNullIsZero(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return Double.parseDouble(text);
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