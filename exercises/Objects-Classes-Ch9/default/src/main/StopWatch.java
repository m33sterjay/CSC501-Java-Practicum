package main;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/** All data fields declared *** private *** -> All constructors/methods declared *** public *** */

/** Design a Class: __StopWatch__
 * + data fields: startTime, endTime -> w/ getters
 * + no-arg constructor: initializes _startTime_ w/ current Time
 * + method: start() -> resets _startTime_ to current time
 * + method: stop() -> set the _endTime_ to current time
 * + method: getElapsedTime() -> returns elapsed time in milliseconds
 * Test Program:
 * + measures execution time of sorting 100,000 numbers using *** Selection Sort *** */
public class StopWatch {
    private long startTime;
    private long endTime;
    private Instant now = Instant.now();
    private Instant start = Instant.now();
    private Instant stop = Instant.now();

    public StopWatch() {
        this.startTime = now;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = start;
    }

    public void stop() {
        this.endTime = stop;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return Duration.between(start, stop).toSeconds();
    }
}
