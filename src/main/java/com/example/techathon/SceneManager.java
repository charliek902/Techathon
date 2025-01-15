package com.example.techathon;

import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.HashMap;

public class SceneManager {
    private Stage stage;
    private HashMap<String, Scene> sceneHashMap;

    public SceneManager(Stage stage){
        this.stage = stage;
        this.sceneHashMap = new HashMap<>();
    }

    public void addScene(Scene scene, String route){
        this.sceneHashMap.put(route, scene);
    }

    public Scene getScene(String route){
        return this.sceneHashMap.get(route);
    }

}
