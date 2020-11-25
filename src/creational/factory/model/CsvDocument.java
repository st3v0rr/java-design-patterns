package creational.factory.model;

public class CsvDocument implements Document {

  @Override
  public String getMediaType() {
    return "application/csv";
  }
}
