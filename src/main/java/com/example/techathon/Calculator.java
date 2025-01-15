package com.example.techathon;

public abstract class Calculator {
    static double userMoney;
    static double finalMoney;
    static double interest = 2;

    public static double SavingsAccountCalculator(double a, short time) {
        userMoney = a;
        finalMoney = userMoney * ((interest/100)+1) * time;

        return  finalMoney;
    }

}
