package com.oocl;

public class GuessNum {


    public String outputResult(String input, String answer) {
        int countA = 0;
        int countB = 0;
        for(int i = 0; i < input.length(); i++){
            if(answer.contains(String.valueOf(input.charAt(i)))){
                countB++;
            }
            if(input.charAt(i) == answer.charAt(i)){
                countA++;
            }
        }
        return countA + "A" + (countB - countA) + "B";
    }

}
