package creational.abstractfactory;

import creational.abstractfactory.model.JsonTransferDocument;
import creational.abstractfactory.model.RestTransferTechnology;
import creational.abstractfactory.model.TransferDocument;
import creational.abstractfactory.model.TransferTechnology;
import creational.abstractfactory.model.XmlTransferDocument;

public class RestTransferFactory implements TransferFactory {

  @Override
  public TransferTechnology createTransferTechnology() {
    return new RestTransferTechnology();
  }

  @Override
  public TransferDocument createTransferDocument(String documentType) {
    if ("xml".equals(documentType)) {
      return new XmlTransferDocument();
    } else if ("json".equals(documentType)) {
      return new JsonTransferDocument();
    }
    throw new IllegalArgumentException("unsupported documentType");
  }
}
