package com.example.techathon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class QuizViewController {
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
    protected void onNotesButtonClick() {
        this.navController.onNotesButtonClick();
    }
    @FXML
    protected void onFinanceQuiz() throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Question.fxml"));
        Parent root = loader.load();
        QuestionViewController questionTemplate = loader.getController();


        questionTemplate.setSceneManager(this.sceneManager);
        questionTemplate.setQuiz("finance");
        questionTemplate.setFirstPage("finance");


        Scene question = new Scene(root);
        this.sceneManager.applyStage(question, "Finance quiz");

    }
    @FXML
    protected void onPersonalityQuiz() throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Question.fxml"));
        Parent root = loader.load();
        QuestionViewController questionTemplate = loader.getController();

        questionTemplate.setSceneManager(this.sceneManager);
        questionTemplate.setQuiz("personality");
        questionTemplate.setFirstPage("personality");

        Scene question = new Scene(root);
        this.sceneManager.applyStage(question, "Personality Quiz");
    }





}
