package com.example.techathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager sceneManager = new SceneManager(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene welcomeScene = new Scene(fxmlLoader.load(), 600, 600);
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("Calculator-view.fxml"));
        Scene calculatorScene = new Scene(fxmlLoader2.load(), 600, 600);
        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("Learn-view.fxml"));
        Scene learnScene = new Scene(fxmlLoader3.load(), 600, 600);
        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("Quiz-view.fxml"));
        Scene quizScene = new Scene(fxmlLoader4.load(), 600, 600);

        sceneManager.addScene(welcomeScene, "welcome");
        sceneManager.addScene(calculatorScene, "calculator");
        sceneManager.addScene(learnScene, "learn");
        sceneManager.addScene(quizScene, "quiz");
        sceneManager.setScene(welcomeScene);

        // add scene manager to controllers

        HelloController welcomeController = fxmlLoader.getController();
        CalculatorController calculatorController = fxmlLoader2.getController();
        LearnViewController learnViewController = fxmlLoader3.getController();
        QuizViewController quizViewController = fxmlLoader4.getController();
        welcomeController.setSceneManager(sceneManager);
        calculatorController.setSceneManager(sceneManager);
        learnViewController.setSceneManager(sceneManager);
        quizViewController.setSceneManager(sceneManager);

        sceneManager.applyStage(welcomeScene, "Welcome!");
    }

    public static void main(String[] args) {
        launch();
    }
}