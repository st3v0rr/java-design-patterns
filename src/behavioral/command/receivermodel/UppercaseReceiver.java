package behavioral.command.receivermodel;

public class UppercaseReceiver implements Receiver {

  @Override
  public void performAction(String s) {
    System.out.println(s.toUpperCase());
  }
}
