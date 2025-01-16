package com.example.techathon;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import java.io.*;
import java.nio.file.Paths;

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
    protected void onNotesButtonClick() throws IOException {
        this.navController.onNotesButtonClick();
    }
    @FXML
    protected void saveNotes() throws IOException {
        writeToFile(this.notes.getText());
    }

    protected void loadNotes() {
        StringBuilder textFile = new StringBuilder();
        String currentWorkingDir = System.getProperty("user.dir");
        String directoryPath = "/src/main/resources/com/example/techathon/notes.txt";
        String fullPath = currentWorkingDir + directoryPath;

        try (BufferedReader reader = new BufferedReader(new FileReader(fullPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textFile.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.notes.setText(textFile.toString());
    }

    public void writeToFile( String textLine ) throws IOException {
        String currentWorkingDir = System.getProperty("user.dir");
        String directoryPath = "/src/main/resources/com/example/techathon/notes.txt";
        String fullPath = currentWorkingDir + directoryPath;

        File file = new File(fullPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(textLine);
        writer.close();
    }








}

