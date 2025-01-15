package com.example.techathon;

import java.util.HashMap;

// stores user information and states on each quiz
public class QuizHandler {
    private String currentQuiz;
    private int user_page;
    private int correct;

    private HashMap<String, Integer> Questions_Answers_Map;

    public QuizHandler(String currentQuiz){
        this.currentQuiz = currentQuiz;
        this.user_page = 1;
        this.correct = 0;
        this.Questions_Answers_Map = new HashMap<>();
    }

    public void handlePrev(){

    }

    public void handleNext(){

    }

    public void handleSelectedAnswer(){

    }

}
