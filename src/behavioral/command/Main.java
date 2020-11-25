package behavioral.command;

import behavioral.command.commandmodel.Command;
import behavioral.command.commandmodel.TransformStringCommand;
import behavioral.command.receivermodel.LowercaseReceiver;
import behavioral.command.receivermodel.Receiver;
import behavioral.command.receivermodel.UppercaseReceiver;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //Use-Case: commands are reused for multiple calls over a series of time

    //The command knows it's receivers
    //Receivers perform actions triggered by a command
    List<Receiver> receivers = Arrays.asList(new LowercaseReceiver(), new UppercaseReceiver());
    Command command = new TransformStringCommand(receivers);

    command.transform("Hello");
    command.transform("World");
  }

}
