package com.example.techathon;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LearnViewController {
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
    public void goToArticle1(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/techathon/Article1.fxml"));
        Scene scene = new Scene(loader.load(), 600, 600);

        // Set the controller into article1 file and sets both navController/sceneManager so navigation should work in this file.
        ArticleController articleController = loader.getController();
        articleController.setNavContoller(navController);
        articleController.setSceneManager(sceneManager);

        scene.getStylesheets().add(getClass().getResource("/com/example/techathon/app.css").toExternalForm());
        // Node used to handle mouse action and targets the VBox that is being clicked and activates the scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Boost Your Money");
        stage.show();

    }
}
