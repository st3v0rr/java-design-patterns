package behavioral.observer.javanineorhigher.publisher;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class StringSubscription implements Subscription {

  private final Subscriber<? super String> subscriber;

  public StringSubscription(Subscriber<? super String> subscriber) {
    this.subscriber = subscriber;
  }

  @Override
  public void request(long n) {
    System.out.println("MySubscription request " + n);
  }

  @Override
  public void cancel() {
    System.out.println("MySubscription cancel");
  }

  public void publishItem(String s) {
    try {
      subscriber.onNext(s);
    } catch (Exception e) {
      subscriber.onError(e);
      subscriber.onComplete();
    }
  }
}
