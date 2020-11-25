package behavioral.observer.javanineorhigher.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class UppercaseSubscriber implements Subscriber<String> {

  @Override
  public void onSubscribe(Subscription subscription) {
    System.out.println("UppercaseSubscriber subscribed");
  }

  @Override
  public void onNext(String item) {
    if (item.equals("error")) {
      throw new IllegalArgumentException("error while onNext");
    } else if (item != null) {
      System.out.println(item.toUpperCase());
    }
  }

  @Override
  public void onError(Throwable throwable) {
    System.out.println("UppercaseSubscriber error: " + throwable.getMessage());
  }

  @Override
  public void onComplete() {
    System.out.println("UppercaseSubscriber complete");
  }
}
