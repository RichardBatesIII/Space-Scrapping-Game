package net.brasscord.school.project.processes;

import java.time.Duration;
import java.time.Instant;

public class TimeCalc {
  // Please ignore this class!
  // Used to get the runtime.
  Instant startPoint;
  
  Instant endingPoint;

  public TimeCalc() {
    this.startPoint = Instant.now();
    this.endingPoint = Instant.now();
  }

  public TimeCalc(Instant end) {
    this.startPoint = Instant.now();
    this.endingPoint = end;
  }

  public TimeCalc(Instant start, Instant end) {
    this.startPoint = start;
    this.endingPoint = end;
  }

  public long getRuntime() {
    return Duration.between(startPoint, endingPoint).getSeconds();
  }

  public Instant getStartingPoint() {
    return startPoint;
  }

  public Instant getEndingPoint() {
    return endingPoint;
  }

  public String toString() {
    return "You lasted " + this.getRuntime() + " seconds.";
  }

  public boolean equals(TimeCalc timer) {
    return timer.getRuntime() == getRuntime()
      && startPoint.equals(timer.getStartingPoint())
      && endingPoint.equals(timer.getEndingPoint());
  }

  public void start() {
    startPoint = Instant.now();
  }

  public void end() {
    endingPoint = Instant.now();
  }
}