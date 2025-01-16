package com.example.techathon;

import javafx.fxml.FXML;

public class NotesViewController {

    private NavController navController;

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
    protected void onNotesButtonClick() {
        this.navController.onNotesButtonClick();
    }
}

