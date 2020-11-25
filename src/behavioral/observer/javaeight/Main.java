package behavioral.observer.javaeight;

import behavioral.observer.javaeight.publisher.StringPublisher;
import behavioral.observer.javaeight.subscriber.LowercaseSubscriber;
import behavioral.observer.javaeight.subscriber.UppercaseSubscriber;
import java.util.Observer;

public class Main {

  public static void main(String[] args) {
    //Use-Case: notify dependent objects in case of changes

    //Deprecated since Java9 !!!
    //StringPublisher needs to Extend Observable
    //StringPublisher needs to call setChanged in case to call the observers
    //Observers need to be added
    StringPublisher publisher = new StringPublisher();
    Observer subscriberA = new UppercaseSubscriber();
    Observer subscriberB = new LowercaseSubscriber();

    publisher.addObserver(subscriberA);
    publisher.addObserver(subscriberB);

    publisher.publishString("Hello");
    publisher.publishString("World");
  }

}
