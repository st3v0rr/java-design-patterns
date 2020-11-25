package creational.abstractfactory.model;

public class JsonTransferDocument implements TransferDocument {

  @Override
  public String getMediaType() {
    return "application/json";
  }
}
