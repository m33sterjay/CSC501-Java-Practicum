package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.StopWatch;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class runStopWatch {
    // measures execution time of sorting 100,000 numbers using SelectionSort
    public static void main(String[] args) {
        StopWatch sortTimer = new StopWatch(); // test time here at init
        int[] sortIndex = rng();
        if (sortIndex.length != 0) {
            sortTimer.start();
            Arrays.sort(sortIndex);
            for (int i = 0; i < sortIndex.length; i++) {
                System.out.println("[ " + sortIndex.toString() + " ]");
            }
            sortTimer.stop();
        } else {
            System.out.printf("null\n");
        }
        System.out.println(sortIndex.toString());
        System.out.printf("Runtime: %d\n", sortTimer.getElapsedTime());
    }

    // generate 100k numbers
    public static int[] rng() {
        Random rand = new Random(100000);
        int[] index = new int[100000];
        for (int i = 0; i < index.length; i++) {
            index[i] = rand.nextInt(100000);
        }
        return index;
    }
}
