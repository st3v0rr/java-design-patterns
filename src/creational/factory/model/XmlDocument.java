package creational.factory.model;

public class XmlDocument implements Document {

  @Override
  public String getMediaType() {
    return "application/xml";
  }
}
