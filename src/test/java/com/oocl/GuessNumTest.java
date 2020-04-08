package com.oocl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GuessNumTest {

    @Test
    public void shouldReturnCorrect() {
        GuessNum answerNumber = new GuessNum();
        System.out.println("Answer is: " + answerNumber.generateRandomArray("5"));

        GuessNum guessingtNumber = new GuessNum();
        String input = "1234";
        System.out.println((input));

       /* ArrayList<Integer> guessingSet = new ArrayList<Integer>(5);
        guessingSet.add(2);
        guessingSet.add(3);
        guessingSet.add(4);
        guessingSet.add(5);
        guessingSet.add(6);
        System.out.println(guessingSet);*/


        //String clue = guessingtNumber.outputResult(guessingSet);
       // System.out.println(clue);


    }


}
