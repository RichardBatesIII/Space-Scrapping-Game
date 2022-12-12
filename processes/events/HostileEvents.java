package processes.events;

import processes.events.EventType;

public abstract class HostileEvents extends Events {

  private boolean instantFailure;
  
  public HostileEvents(EventType eventType, boolean instantFailure) {
    super(eventType);
    this.instantFailure = instantFailure;
  }

  public abstract void victory();
  public abstract void failure();
  
}