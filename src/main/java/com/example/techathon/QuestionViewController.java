package com.example.techathon;

import java.util.HashMap;

// stores user information and states on each quiz
public class QuestionViewController {
    private String currentQuiz;
    private int user_page;
    private int correct;
    private String currentPage;

    private HashMap<String, String[]> Questions_Options_Finance_Map;
    private HashMap<String, Integer> Questions_Finance_Correct_Answers_Map;

    private HashMap<String, String[]> Questions_Options_Personality_Map;
    private HashMap<String, Integer> Questions_Personality_Correct_Answers_Map;


    public QuestionViewController(String currentQuiz){
        this.currentQuiz = currentQuiz;
        this.user_page = 1;
        this.correct = 0;
        this.Questions_Options_Finance_Map = new HashMap<>(10);
        this.Questions_Finance_Correct_Answers_Map = new HashMap<>(10);
        this.Questions_Options_Personality_Map = new HashMap<>(10);
        this.Questions_Finance_Correct_Answers_Map = new HashMap<>(10);
        this.populateHashMaps();
    }


    private void populateHashMaps(){
        this.Questions_Options_Finance_Map.put("What is the purpose of an emergency fund?", new String[]{
                "A. To pay off debt",
                "B. To cover unexpected expenses",
                "C. To invest in the stock market",
                "D. To save for retirement"
        });

        this.Questions_Options_Finance_Map.put("Which of the following is NOT a type of retirement account?", new String[]{
                "A. 401(k)",
                "B. Roth IRA",
                "C. Savings Account",
                "D. Traditional IRA"
        });

        this.Questions_Options_Finance_Map.put("What does diversification aim to achieve in an investment portfolio?", new String[]{
                "A. Maximizing returns with high risk",
                "B. Reducing risk by spreading investments",
                "C. Increasing the expense ratio",
                "D. Concentrating investments in one sector"
        });

        this.Questions_Options_Finance_Map.put("Which is a characteristic of a stock?", new String[]{
                "A. Guaranteed returns",
                "B. Represents ownership in a company",
                "C. Fixed interest payments",
                "D. Matures after a specific period"
        });

        this.Questions_Options_Finance_Map.put("What is the primary goal of a corporation’s financial management?", new String[]{
                "A. Minimizing costs",
                "B. Maximizing shareholder wealth",
                "C. Achieving social responsibility goals",
                "D. Expanding into new markets"
        });

        this.Questions_Options_Finance_Map.put("Which of the following is a measure of profitability?", new String[]{
                "A. Debt-to-equity ratio",
                "B. Current ratio",
                "C. Return on equity (ROE)",
                "D. Quick ratio"
        });

        this.Questions_Options_Finance_Map.put("What does the Federal Reserve use to control inflation?", new String[]{
                "A. Fiscal policy",
                "B. Tax cuts",
                "C. Monetary policy",
                "D. Government spending"
        });

        this.Questions_Options_Finance_Map.put("Which of the following is considered a lagging economic indicator?", new String[]{
                "A. Stock market performance",
                "B. Unemployment rate",
                "C. Building permits",
                "D. Consumer confidence index"
        });

        this.Questions_Options_Finance_Map.put("What is the main function of a central bank?", new String[]{
                "A. Providing loans to consumers",
                "B. Setting monetary policy",
                "C. Investing in private companies",
                "D. Offering savings accounts"
        });

        this.Questions_Options_Finance_Map.put("Which is a characteristic of a Certificate of Deposit (CD)?", new String[]{
                "A. High liquidity with no fixed term",
                "B. Higher interest rates than savings accounts",
                "C. Interest rates fluctuate daily",
                "D. Unlimited withdrawals"
        });

        this.Questions_Options_Personality_Map.put("Which of the following best describes an extrovert?", new String[]{
                "A. Prefers solitude and introspection",
                "B. Feels energized by social interactions",
                "C. Is highly detail-oriented",
                "D. Avoids taking risks"
        });

        this.Questions_Options_Personality_Map.put("What is a key characteristic of an empathetic person?", new String[]{
                "A. Strong logical reasoning",
                "B. Ability to understand others' feelings",
                "C. Preference for working alone",
                "D. Focus on achieving goals"
        });

        this.Questions_Options_Personality_Map.put("How does a Type A personality typically behave?", new String[]{
                "A. Relaxed and easy-going",
                "B. Competitive and driven",
                "C. Introverted and reflective",
                "D. Highly creative"
        });

        this.Questions_Options_Personality_Map.put("Which personality trait is part of the 'Big Five' model?", new String[]{
                "A. Aggressiveness",
                "B. Neuroticism",
                "C. Optimism",
                "D. Enthusiasm"
        });

        this.Questions_Options_Personality_Map.put("What is a hallmark of a conscientious person?", new String[]{
                "A. Prefers spontaneity",
                "B. Is organized and responsible",
                "C. Frequently changes focus",
                "D. Enjoys taking risks"
        });

        this.Questions_Options_Personality_Map.put("Which Myers-Briggs type is known for being imaginative and idealistic?", new String[]{
                "A. ISTJ",
                "B. ENFP",
                "C. ESTP",
                "D. ISFJ"
        });

        this.Questions_Options_Personality_Map.put("What is a trait of someone high in emotional intelligence?", new String[]{
                "A. Strong mathematical skills",
                "B. Ability to regulate their emotions",
                "C. Preference for abstract ideas",
                "D. Introverted behavior"
        });

        this.Questions_Options_Personality_Map.put("Which of the following is a characteristic of an agreeable person?", new String[]{
                "A. Highly competitive",
                "B. Cooperative and compassionate",
                "C. Independent and assertive",
                "D. Detail-oriented and meticulous"
        });

        this.Questions_Options_Personality_Map.put("What is a defining feature of an introvert?", new String[]{
                "A. Draws energy from solitude",
                "B. Enjoys constant social interaction",
                "C. Takes frequent risks",
                "D. Has a strong need for attention"
        });

        this.Questions_Options_Personality_Map.put("Which personality type thrives in high-stress environments?", new String[]{
                "A. Type B personality",
                "B. Type A personality",
                "C. Creative thinker",
                "D. Empathetic leader"
        });
    }

    public void handlePrev(){
        this.user_page -= 1;
        if(this.user_page < 1){
            // route to quiz menu page
        }
        else{
            String prevPage = this.getNextPage(this.currentPage, this.currentQuiz);
            // populate question template with next page
        }

    }

    public void handleNext(){
        this.user_page += 1;
        if(this.user_page > 10){
            // route to answers --> populate answer template with results
        }
        else{
            String nextPage = this.getNextPage(this.currentPage, this.currentQuiz);
            // populate question template with next page

        }
    }

    public String getNextPage(String currentPage, String QuizType){
        Boolean foundCurrentPage = false;
        Boolean foundNextPage = false;
        String nextPage = "";
        switch(QuizType){
            case "personality":
                for (String key : Questions_Options_Personality_Map.keySet()) {
                    if(foundCurrentPage && !foundNextPage){
                        foundNextPage = true;
                        nextPage = key;
                    }
                    else if(key == currentPage){
                        foundCurrentPage = true;
                    }
                }
                return nextPage;
            case "finance":
                for (String key : Questions_Options_Finance_Map.keySet()) {
                    if(foundCurrentPage && !foundNextPage){
                        foundNextPage = true;
                        nextPage = key;
                    }
                    else if(key == currentPage){
                        foundCurrentPage = true;
                    }
                }
                return nextPage;
            default:
                return "";
        }
    }
/*
    public String getPrevPage(String currentPage, String QuizType){
        Boolean foundCurrentPage = false;
        String prevPage = "";
        String currentPage = "";
        switch(QuizType){
            case "personality":
                for (String key : Questions_Options_Personality_Map.keySet()) {
                    if(foundCurrentPage && !foundNextPage){
                        foundCurrentPage = true;
                        nextPage = key;
                    }
                    else if(key == currentPage){
                        foundCurrentPage = true;
                    }
                }
                return nextPage;
            case "finance":
                for (String key : Questions_Options_Finance_Map.keySet()) {
                    if(foundCurrentPage && !foundNextPage){
                        foundNextPage = true;
                        nextPage = key;
                    }
                    else if(key == currentPage){
                        foundCurrentPage = true;
                    }
                }
                return nextPage;
            default:
                return "";
        }
        return "";

    }
    */

    public void handleSelectedAnswer(){

    }

}
