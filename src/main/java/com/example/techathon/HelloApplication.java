package com.example.techathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /*big initialisation for all the scenes
        horrible code that shouldn't exist */

        SceneManager sceneManager = new SceneManager(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene welcomeScene = new Scene(fxmlLoader.load(), 600, 600);
        welcomeScene.getStylesheets().add(HelloApplication.class.getResource("/com/example/techathon/app.css").toExternalForm());

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("chooseCalculator-view.fxml"));


        Scene calculatorScene = new Scene(fxmlLoader2.load(), 600, 600);
        calculatorScene.getStylesheets().add(HelloApplication.class.getResource("/com/example/techathon/app.css").toExternalForm());

        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("Learn-view.fxml"));
        Scene learnScene = new Scene(fxmlLoader3.load(), 600, 600);
        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("Quiz-view.fxml"));
        Scene quizScene = new Scene(fxmlLoader4.load(), 600, 600);

        FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("ISA-calculator.fxml"));
        Scene ISA_Calc = new Scene(fxmlLoader5.load(), 600, 600);
        FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("pension-calculator.fxml"));
        Scene pension_Calc = new Scene(fxmlLoader6.load(), 600, 600);
        FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("mortgage-calculator.fxml"));
        Scene mortgage_Calc = new Scene(fxmlLoader7.load(), 600, 600);

        sceneManager.addScene(welcomeScene, "welcome");
        sceneManager.addScene(calculatorScene, "calculator");
        sceneManager.addScene(learnScene, "learn");
        sceneManager.addScene(quizScene, "quiz");
        sceneManager.addScene(ISA_Calc, "ISA-calculator");
        sceneManager.addScene(pension_Calc, "pension-calculator");
        sceneManager.addScene(mortgage_Calc, "mortgage-calculator");


        sceneManager.setScene(welcomeScene);

        //MAKE CONTROLLERS
        HelloController welcomeController = fxmlLoader.getController();
        chooseCalculatorController chooseCalculatorController = fxmlLoader2.getController();
        LearnViewController learnViewController = fxmlLoader3.getController();
        QuizViewController quizViewController = fxmlLoader4.getController();

        CalculatorController isaController = fxmlLoader5.getController();
        CalculatorController pensionController = fxmlLoader6.getController();
        CalculatorController mortgageController = fxmlLoader7.getController();

        // add scene manager to controllers
        welcomeController.setSceneManager(sceneManager);
        chooseCalculatorController.setSceneManager(sceneManager);
        learnViewController.setSceneManager(sceneManager);
        quizViewController.setSceneManager(sceneManager);
        isaController.setSceneManager(sceneManager);
        pensionController.setSceneManager(sceneManager);
        mortgageController.setSceneManager(sceneManager);




        NavController navController = new NavController(sceneManager);

        welcomeController.setNavContoller(navController);
        chooseCalculatorController.setNavContoller(navController);
        learnViewController.setNavContoller(navController);
        quizViewController.setNavContoller(navController);

        isaController.setNavContoller(navController);
        pensionController.setNavContoller(navController);
        mortgageController.setNavContoller(navController);


        sceneManager.applyStage(welcomeScene, "Welcome!");
    }

    public static void main(String[] args) {
        launch();
    }
}