package com.oocl;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class AppTest {
    @Test
    public void helloWorld() {

    }

    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Output: " + s);
    }

}