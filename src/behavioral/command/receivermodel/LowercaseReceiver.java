package behavioral.command.receivermodel;

public class LowercaseReceiver implements Receiver {

  @Override
  public void performAction(String s) {
    System.out.println(s.toLowerCase());
  }
}
