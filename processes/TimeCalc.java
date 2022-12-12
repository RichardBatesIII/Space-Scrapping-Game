package processes;

import java.time.Duration;
import java.time.Instant;

public class TimeCalc {
  // Please ignore this class!
  // Used to get the runtime.
  Instant startPoint;
  Instant endingPoint;

  protected TimeCalc() {
    this.startPoint = Instant.now();
    this.endingPoint = Instant.now();
  }

  protected TimeCalc(Instant end) {
    this.startPoint = Instant.now();
    this.endingPoint = end;
  }

  protected TimeCalc(Instant start, Instant end) {
    this.startPoint = start;
    this.endingPoint = end;
  }

  public String toString() {
    return "You lasted " + this.getRuntime() + " seconds.";
  }

  public void start() {
    startPoint = Instant.now();
  }

  public void end() {
    endingPoint = Instant.now();
  }

  public long getRuntime() {
    return Duration.between(startPoint, endingPoint).getSeconds();
  }
}