package creational.factory;

import creational.factory.model.Document;

public class Main {

  public static void main(String[] args) {
    //Use-Case: create similar objects

    //The factory decides which element is created
    //The client doesn't need to know details about the document implementations

    Document xmlDocument = DocumentFactory.createDocument("application/xml");
    System.out.println(xmlDocument.getMediaType());
    Document csvDocument = DocumentFactory.createDocument("application/csv");
    System.out.println(csvDocument.getMediaType());
    Document pdfDocument = DocumentFactory.createDocument("application/xml");
    System.out.println(pdfDocument.getMediaType());
  }
}
