package com.oocl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class GuessNumTest {

    public String randomNumbers = "";
    public boolean isDuplicate = false;

    public void generateRandom() {
        Random random = new Random();
        randomNumbers = String.format("%04d", random.nextInt(10000));
    }

    public static boolean checkIfDuplicate(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String errorMessageIfWrongInput(String input) {
        if (input.length() != 4 || isDuplicate) {
            return "Wrong Input.";
        }
        return null;
    }

    @Test
    public void should_return_error_if_wrong_input() {
        String input = "2234";
        isDuplicate = checkIfDuplicate(input);
        Assert.assertEquals("Wrong Input.", errorMessageIfWrongInput(input));
    }

    @Test
    public void should_return_0A0B() {
        generateRandom();

        String input = "2234";
        String answer = "5678";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("0A0B", result);
    }


    @Test
    public void should_return_1A0B() {

        String input = "1234";
        String answer = "1567";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("1A0B", result);
    }

    @Test
    public void should_return_0A2B() {

        String input = "1234";
        String answer = "2478";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A2B() {

        String input = "1234";
        String answer = "0324";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("1A2B", result);
    }

    @Test
    public void should_return_0A4B() {

        String input = "1234";
        String answer = "4321";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_4A0B() {

        String input = "1234";
        String answer = "1234";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input, answer);

        Assert.assertEquals("4A0B", result);
    }
}
