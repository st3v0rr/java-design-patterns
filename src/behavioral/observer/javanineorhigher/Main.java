package behavioral.observer.javanineorhigher;

import behavioral.observer.javanineorhigher.publisher.StringPublisher;
import behavioral.observer.javanineorhigher.subscriber.LowercaseSubscriber;
import behavioral.observer.javanineorhigher.subscriber.UppercaseSubscriber;
import java.util.concurrent.Flow.Subscriber;

public class Main {

  public static void main(String[] args) {
    //Use-Case: notify dependent objects in case of changes

    //StringPublisher needs to implement Publisher and holds the Subscriptions
    //Subscribers need to implement Subscriber
    //StringSubscription holds the Subscribers
    //Subscribers need to be registered in the publisher

    StringPublisher publisher = new StringPublisher();
    Subscriber<String> uppercaseSubscriber = new UppercaseSubscriber();
    Subscriber<String> lowercaseSubscriber = new LowercaseSubscriber();

    publisher.subscribe(uppercaseSubscriber);
    publisher.subscribe(lowercaseSubscriber);

    publisher.publishString("Hello");
    publisher.publishString("World");
    publisher.publishString("error");
  }

}
