package creational.abstractfactory.model;

public class XmlTransferDocument implements TransferDocument {

  @Override
  public String getMediaType() {
    return "application/xml";
  }
}
