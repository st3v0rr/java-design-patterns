package creational.abstractfactory;

import creational.abstractfactory.model.TransferDocument;

public class Main {

  public static void main(String[] args) {
    //Use-Case: create similar object-groups

    //The factory decides which elements are created
    //The client doesn't need to know details about the further implementations
    TransferDocument restJsonDocument = new RestTransferFactory().createTransferDocument("json");
    System.out.println(restJsonDocument.getMediaType());

    TransferDocument restXmlDocument = new RestTransferFactory().createTransferDocument("xml");
    System.out.println(restXmlDocument.getMediaType());

    TransferDocument soapXmlDocument = new SoapTransferFactory().createTransferDocument("xml");
    System.out.println(soapXmlDocument.getMediaType());

    //will not work because the soap-factory doesn't allow json documents
    //TransferDocument soapJsonDocument = new SoapTransferFactory().createTransferDocument("json");
  }

}
