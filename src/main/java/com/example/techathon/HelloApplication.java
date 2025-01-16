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
        learnScene.getStylesheets().add(HelloApplication.class.getResource("/com/example/techathon/app.css").toExternalForm());
        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("Quiz-view.fxml"));
        Scene quizScene = new Scene(fxmlLoader4.load(), 600, 600);

        FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("ISA-calculator.fxml"));
        Scene ISA_Calc = new Scene(fxmlLoader5.load(), 600, 600);
        FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("pension-calculator.fxml"));
        Scene pension_Calc = new Scene(fxmlLoader6.load(), 600, 600);
        FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("mortgage-calculator.fxml"));
        Scene mortgage_Calc = new Scene(fxmlLoader7.load(), 600, 600);
        FXMLLoader loaderForBudgetCalc = new FXMLLoader(HelloApplication.class.getResource("budgeting-calculator.fxml"));
        Scene budgetCalc = new Scene(loaderForBudgetCalc.load(), 600, 600);

        FXMLLoader fxmlLoader8 = new FXMLLoader(HelloApplication.class.getResource("Answers-view.fxml"));
        Scene answersScene = new Scene(fxmlLoader8.load(), 600, 600);

        FXMLLoader fxmlLoader9 = new FXMLLoader(HelloApplication.class.getResource("Question.fxml"));
        Scene questionsScene = new Scene(fxmlLoader9.load(), 600, 600);

        sceneManager.addScene(welcomeScene, "welcome");
        sceneManager.addScene(calculatorScene, "calculator");
        sceneManager.addScene(learnScene, "learn");
        sceneManager.addScene(quizScene, "quiz");
        sceneManager.addScene(ISA_Calc, "ISA-calculator");
        sceneManager.addScene(pension_Calc, "pension-calculator");
        sceneManager.addScene(mortgage_Calc, "mortgage-calculator");
        sceneManager.addScene(answersScene, "answers");
        sceneManager.addScene(questionsScene, "question");
        sceneManager.addScene(budgetCalc, "budget-calculator");

        sceneManager.setScene(welcomeScene);

        //MAKE CONTROLLERS
        HelloController welcomeController = fxmlLoader.getController();
        chooseCalculatorController chooseCalculatorController = fxmlLoader2.getController();
        LearnViewController learnViewController = fxmlLoader3.getController();
        QuizViewController quizViewController = fxmlLoader4.getController();

        CalculatorController isaController = fxmlLoader5.getController();
        CalculatorController pensionCalcController = fxmlLoader6.getController();
        CalculatorController mortgageCalcController = fxmlLoader7.getController();
        CalculatorController budgetCalcController = loaderForBudgetCalc.getController();


        AnswerViewController answerViewController = fxmlLoader8.getController();
        QuestionViewController question = fxmlLoader9.getController();

        // add scene manager to controllers
        welcomeController.setSceneManager(sceneManager);
        chooseCalculatorController.setSceneManager(sceneManager);
        learnViewController.setSceneManager(sceneManager);
        quizViewController.setSceneManager(sceneManager);
        isaController.setSceneManager(sceneManager);
        pensionCalcController.setSceneManager(sceneManager);
        mortgageCalcController.setSceneManager(sceneManager);
        budgetCalcController.setSceneManager(sceneManager);

        NavController navController = new NavController(sceneManager);

        welcomeController.setNavContoller(navController);
        chooseCalculatorController.setNavContoller(navController);
        learnViewController.setNavContoller(navController);
        quizViewController.setNavContoller(navController);
        isaController.setNavContoller(navController);
        pensionCalcController.setNavContoller(navController);
        mortgageCalcController.setNavContoller(navController);
        answerViewController.setNavContoller(navController);
        question.setNavContoller(navController);
        budgetCalcController.setNavContoller(navController);


        sceneManager.applyStage(welcomeScene, "Welcome!");
    }

    public static void main(String[] args) {
        launch();
    }
}