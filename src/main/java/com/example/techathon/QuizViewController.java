package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.Scene;

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
    protected void onFinanceQuiz() {
        // finance quiz
        QuestionViewController questionTemplate = new QuestionViewController();
        questionTemplate.setSceneManager(this.sceneManager);
        questionTemplate.setQuiz("finance");
        String page = questionTemplate.getFirstPage("finance");
        Scene question = this.sceneManager.getScene("question");
        this.sceneManager.applyStage(question, "Finance quiz");

    }
    @FXML
    protected void onPersonalityQuiz() {
        // personality quiz
        QuestionViewController questionTemplate = new QuestionViewController();
        questionTemplate.setSceneManager(this.sceneManager);
        questionTemplate.setQuiz("personality");
        String page = questionTemplate.getFirstPage("personality");
        Scene question = this.sceneManager.getScene("question");
        this.sceneManager.applyStage(question, "Finance quiz");
    }





}
