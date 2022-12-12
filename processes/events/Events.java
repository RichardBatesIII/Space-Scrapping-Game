package processes.events;

public abstract class Events {
  // A abstract class for creating template events.
  
  private EventType eventType;
  private String[] options;
  
  public Events(EventType eventType) {
    this.eventType = eventType;
  }

  public abstract void outcome();
  public abstract void action();
  public abstract String toString();
  
}