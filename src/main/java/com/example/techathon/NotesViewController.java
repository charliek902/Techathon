package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotesViewController {

    private NavController navController;

    public void setNavContoller(NavController controller){
        this.navController = controller;
    }

    @FXML
    private TextArea notes;
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
    protected void saveNotes() {
        // save to notes.txt


    }

    protected void loadNotes() {
        StringBuilder textFile = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("../../../resources/com/example/techathon/notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textFile.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("test:");
        System.out.println(textFile.toString());


        this.notes.setText(textFile.toString());
    }








}

