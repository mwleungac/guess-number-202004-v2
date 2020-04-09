package com.oocl;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class GuestNumberTest {

    public int[] randomNumbers = {};

    public void generateRandomNumbers() {
        int numOfNumbersInSet = 4;
        int[] randomNumSet = new int[numOfNumbersInSet];

        for (int i = 0; i < 4; i++) {
            randomNumSet[i] = (int)(Math.random() * 10);

            for (int j = 0; j < i; j++) {
                if (randomNumSet[i] == randomNumSet[j]) {
                    randomNumSet[j] = (int)(Math.random() * 10);
                }
            }
        }
        randomNumbers = randomNumSet;
    }

    public static int findIndex(int arr[], int t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t == arr[i])
                .findFirst()
                .orElse(-1);
    }

    @Test
    public void OutputResult() {

        generateRandomNumbers();

        int guessNumLength = 5;
        int[] randomNum = randomNumbers;
        int[] guessingNum = {1, 2, 3, 4};
        Integer correctNumbers = 0;
        Integer correctPositionAndNumber = 0;

        if (guessingNum.length < guessNumLength) {

            System.out.println("Generated Numbers : " + Arrays.toString(randomNum));
            System.out.println("Inputted Numbers : " + Arrays.toString(guessingNum));

            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < randomNum.length; i++) {
                if (findIndex(randomNum, randomNum[i]) == findIndex(guessingNum, guessingNum[i])
                        && randomNum[i] == guessingNum[i]) {
                    correctPositionAndNumber = correctPositionAndNumber + 1;
                }

            }

            for (int i = 0; i < randomNum.length; i++) {

                for (int j = 0; j < guessingNum.length; j++) {
                    if (randomNum[i] == guessingNum[j]) {
                        set.add(randomNum[i]);
                        correctNumbers = correctNumbers + 1;

                    }
                }
            }

            correctNumbers = correctNumbers - correctPositionAndNumber;

            System.out.println("No of correct num: " + correctNumbers);
            System.out.println("No of correct positions and num: " + correctPositionAndNumber);
            System.out.println("Result: " + correctPositionAndNumber + "A" + correctNumbers + "B");
        }
        else {

            System.out.println("Wrong Input, Input again");
        }
    }

}
