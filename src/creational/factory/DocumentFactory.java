package creational.factory;

import creational.factory.model.CsvDocument;
import creational.factory.model.Document;
import creational.factory.model.PdfDocument;
import creational.factory.model.XmlDocument;

public class DocumentFactory {

  private DocumentFactory() {
    //not constructable
  }

  public static Document createDocument(String mediaType) {
    switch (mediaType) {
      case "application/xml":
        return new XmlDocument();
      case "application/pdf":
        return new PdfDocument();
      case "application/csv":
        return new CsvDocument();
      default:
        throw new IllegalArgumentException("unsupported mediaType");
    }
  }

}
