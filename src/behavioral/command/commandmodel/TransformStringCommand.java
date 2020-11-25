package behavioral.command.commandmodel;

import behavioral.command.receivermodel.Receiver;
import java.util.List;

public class TransformStringCommand implements Command {

  private final List<Receiver> receivers;

  public TransformStringCommand(List<Receiver> receivers) {
    this.receivers = receivers;
  }

  @Override
  public void transform(String s) {
    receivers.forEach(receiver -> receiver.performAction(s));
  }
}
