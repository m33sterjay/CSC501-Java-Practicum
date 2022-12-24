package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Stock;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class StockTests {
    // what the solution should be?
    private static class Solution {
        public String symbol = "";
        public String name = "";
        public double percentChange = 0;

        public Solution(double percentChange) {
            this.percentChange = percentChange;
        }
    }

    @Test
    void testDefault() {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Stock tester = new Stock();
            tester.setStockPrices(100.0, 98.5);
            tester.getChangePercent();
        });
        Stock tester = new Stock();
        assertEquals(0, tester.getChangePercent());
        tester.setStockPrices(100.0, 98.5);
        assertEquals(-1.50, tester.getChangePercent());
    }

    @Test
    void test1() {
        double[] setChangePercent = { 1.5d, -1.5d, 5.0d };
        Solution[] solveSolutions = {
                new Solution(1.5d),
                new Solution(-1.5d),
                new Solution(5.0d)
        };
        test(setChangePercent, solveSolutions);
    }

    private void test(double[] setChangePercent, Solution[] solveSolutions) {
        Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            Stock tester = new Stock();
            for (double mod : setChangePercent) {
                if (mod >= 0) {
                    tester.setStockPrices(100.0 - mod, 100.0);
                } else {
                    tester.setStockPrices(100.0, 100.0 - mod);
                }
            }
            tester.getChangePercent();
        });
        Stock tester = new Stock();
        for (int i = 0; i < setChangePercent.length; i++) {
            if (setChangePercent[i] >= 0) {
                tester.setStockPrices(100.0 - setChangePercent[i], 100.0);
            } else {
                tester.setStockPrices(100.0, 100.0 - setChangePercent[i]);
            }
            assertEquals(solveSolutions[i].percentChange, tester.getChangePercent());
        }
    }
}
