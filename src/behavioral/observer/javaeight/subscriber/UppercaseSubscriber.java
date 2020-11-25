package behavioral.observer.javaeight.subscriber;

import java.util.Observable;
import java.util.Observer;

public class UppercaseSubscriber implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println(((String) arg).toUpperCase());
  }
}
