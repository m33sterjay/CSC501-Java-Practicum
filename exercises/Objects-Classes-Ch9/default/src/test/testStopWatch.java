package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.StopWatch;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.sql.Time;
import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

public class testStopWatch {
    private static class MockWatch {
        public long startTime;
        public long endTime;
        public long elapsed;

        public MockWatch(long duration) {
            this.elapsed = duration;
        }
    }

    @Test
    void baseline() {
        Assertions.assertTimeout(Duration.ofSeconds(5), () -> {
            StopWatch test = new StopWatch();
            assertEquals(Instant.now().toEpochMilli(), test.getStartTime());
            assertEquals(0, test.getEndTime());

            int[] testArray = new int[0];
            assertEquals(0, testArray.length);

            test.start();
            assertEquals(true, Instant.now().toEpochMilli() - test.getStartTime() < 3);

           if (Instant.now().toEpochMilli() >= test.getStartTime() + 3000) {
             test.stop();
           }
            //assertEquals(Instant.now().toEpochMilli(), test.getEndTime());

            //assertEquals(3000, test.getEndTime() - test.getStartTime());
            assertEquals(3000, test.getElapsedTime());
            assertEquals(true, test.getElapsedTime() == test.getEndTime() - test.getStartTime());
        });
    }
}
