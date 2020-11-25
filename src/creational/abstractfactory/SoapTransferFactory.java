package creational.abstractfactory;

import creational.abstractfactory.model.SoapTransferTechnology;
import creational.abstractfactory.model.TransferDocument;
import creational.abstractfactory.model.TransferTechnology;
import creational.abstractfactory.model.XmlTransferDocument;

public class SoapTransferFactory implements TransferFactory {

  @Override
  public TransferTechnology createTransferTechnology() {
    return new SoapTransferTechnology();
  }

  @Override
  public TransferDocument createTransferDocument(String documentType) {
    if ("xml".equals(documentType)) {
      return new XmlTransferDocument();
    }
    throw new IllegalArgumentException("unsupported documentType");
  }
}
