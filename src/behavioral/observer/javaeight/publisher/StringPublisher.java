package behavioral.observer.javaeight.publisher;

import java.util.Observable;

public class StringPublisher extends Observable {

  public void publishString(String s) {
    this.setChanged();
    this.notifyObservers(s);
  }
}
