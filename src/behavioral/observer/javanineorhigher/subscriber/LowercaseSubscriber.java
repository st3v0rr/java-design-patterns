package behavioral.observer.javanineorhigher.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class LowercaseSubscriber implements Subscriber<String> {

  @Override
  public void onSubscribe(Subscription subscription) {
    System.out.println("LowercaseSubscriber subscribed");
  }

  @Override
  public void onNext(String item) {
    if (item.equals("error")) {
      throw new IllegalArgumentException("error while onNext");
    } else if (item != null) {
      System.out.println(item.toLowerCase());
    }
  }

  @Override
  public void onError(Throwable throwable) {
    System.out.println("LowercaseSubscriber error");
  }

  @Override
  public void onComplete() {
    System.out.println("LowercaseSubscriber complete");
  }
}
