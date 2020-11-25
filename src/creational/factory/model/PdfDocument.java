package creational.factory.model;

public class PdfDocument implements Document {

  @Override
  public String getMediaType() {
    return "application/pdf";
  }
}
