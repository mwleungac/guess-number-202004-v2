package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumTest {

    @Test
    public void should_return_0A0B() {

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

}
