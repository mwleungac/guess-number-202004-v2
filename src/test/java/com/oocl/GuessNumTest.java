package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumTest {

    public boolean isDuplicate = false;

    @Test
    public void should_return_error_if_wrong_input() {
        String input = "2234";

        GuessNum guessNum = new GuessNum();
        isDuplicate = guessNum.checkIfDuplicate(input);
        Assert.assertEquals("Wrong Input.", guessNum.errorMessageIfWrongInput(input));
    }

    @Test
    public void should_generate_4_digit_random_numbers() {

        GuessNum guessNum = new GuessNum();
        Assert.assertNotNull(guessNum.generateRandomNumbers());
    }

    @Test
    public void should_return_0A0B() {

        GuessNum guessNum = new GuessNum();
        String input = "2234";
        String answer = "5678";
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
