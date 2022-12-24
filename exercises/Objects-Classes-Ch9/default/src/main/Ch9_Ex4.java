package main;

import java.util.Random;

/** Program that creates _Random_ object w/ seed *1000*
 * + displays first 50 rand integers {0-100} using _nextInt(100)_ method */
public class Ch9_Ex4 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.printf("%d ", rand.nextInt(100));
        }
    }
}
