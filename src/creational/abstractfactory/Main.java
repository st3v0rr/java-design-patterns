package creational.abstractfactory;

import creational.abstractfactory.model.TransferDocument;
import creational.abstractfactory.model.TransferTechnology;

public class Main {

  public static void main(String[] args) {
    //Use-Case: create similar object-groups

    //The factory decides which elements are created
    //The client doesn't need to know details about the further implementations
    TransferFactory restTransferFactory = new RestTransferFactory();
    TransferFactory soapTransferFactory = new SoapTransferFactory();

    TransferDocument restJsonDocument = restTransferFactory.createTransferDocument("json");
    System.out.println(restJsonDocument.getMediaType());

    TransferDocument restXmlDocument = restTransferFactory.createTransferDocument("xml");
    System.out.println(restXmlDocument.getMediaType());

    TransferDocument soapXmlDocument = soapTransferFactory.createTransferDocument("xml");
    System.out.println(soapXmlDocument.getMediaType());

    //will not work because the soap-factory doesn't allow json documents
    //TransferDocument soapJsonDocument = new SoapTransferFactory().createTransferDocument("json");

    TransferTechnology restTechnology = restTransferFactory.createTransferTechnology();
    System.out.println(restTechnology.getName());

    TransferTechnology soapTechnology = soapTransferFactory.createTransferTechnology();
    System.out.println(soapTechnology.getName());
  }

}
