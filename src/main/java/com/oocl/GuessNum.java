package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessNum {

    private String answer;

    public String generateRandomArray(String randNum){
        //Random random = new Random();
        int rand_int1 =  1234; //random.nextInt(10000);
        return String.valueOf(rand_int1);

    }

    public String outputResult(String numbers) {

        int positionAndNumberCorrectCount = 0;
        int onlyNumberCorrectCount = 0;
        for(char number : numbers.toCharArray()){
            boolean isCorrectNumberAndCorrectIndex = this.answer.contains(Character.toString(number))
                    && this.answer.indexOf(number) == numbers.indexOf(number);
            boolean isCorrectNumberAndWrongIndex = this.answer.contains(Character.toString(number))
                    && this.answer.indexOf(number) != numbers.indexOf(number);

            if (isCorrectNumberAndCorrectIndex) positionAndNumberCorrectCount++;
            if(isCorrectNumberAndWrongIndex) onlyNumberCorrectCount++;
        }
        return String.format("%sA%sB",positionAndNumberCorrectCount,onlyNumberCorrectCount);


    }
}
