package behavioral.observer.javanineorhigher.publisher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class StringPublisher implements Publisher<String> {

  private final List<StringSubscription> subscriptions = Collections.synchronizedList(new ArrayList<>());

  @Override
  public void subscribe(Subscriber<? super String> subscriber) {
    StringSubscription subscription = new StringSubscription(subscriber);
    subscriptions.add(subscription);
    subscriber.onSubscribe(subscription);
  }

  public void publishString(String s) {
    subscriptions.forEach(subscription -> subscription.publishItem(s));
  }
}
