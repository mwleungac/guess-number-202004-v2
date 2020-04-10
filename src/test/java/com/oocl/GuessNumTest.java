package com.oocl;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class GuessNumTest {

    public String randomNumbers = "";

    public void generateRandom() {
        Random random = new Random();
        String randomNum = String.format("%04d", random.nextInt(10000));
        randomNumbers = randomNum;
    }

    @Test
    public void should_return_0A0B() {
        generateRandom();

        String input = "1234";
        String answer = "5678";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("0A0B", result);
    }
    
    @Test
    public void should_return_1A0B() {

        String input = "1234";
        String answer = "1567";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("1A0B", result);
    }

    @Test
    public void should_return_0A2B() {

        String input = "1234";
        String answer = "2478";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("0A2B", result);
    }

    @Test
    public void should_return_1A2B() {

        String input = "1234";
        String answer = "0324";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("1A2B", result);
    }

    @Test
    public void should_return_0A4B() {

        String input = "1234";
        String answer = "4321";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_4A0B() {

        String input = "1234";
        String answer = "1234";

        GuessNum guessNum = new GuessNum();
        String result = guessNum.outputResult(input , answer);

        Assert.assertEquals("4A0B", result);
    }
}
