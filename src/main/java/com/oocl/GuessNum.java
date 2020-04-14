package com.oocl;

import java.util.Random;

public class GuessNum {

    private boolean isDuplicate = false;
    private static final int INPUT_LENGTH = 4;

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

    public String errorMessageIfWrongInput(String input) {
        if (input.length() != INPUT_LENGTH || isDuplicate) {
            return "Wrong Input.";
        }
        return null;
    }

    public boolean checkIfDuplicate(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    isDuplicate = true;
                    return true;
                }
            }
        }
        return false;
    }

    public String generateRandomNumbers() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }

}
