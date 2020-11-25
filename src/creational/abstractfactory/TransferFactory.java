package creational.abstractfactory;

import creational.abstractfactory.model.TransferDocument;
import creational.abstractfactory.model.TransferTechnology;

public interface TransferFactory {

  TransferTechnology createTransferTechnology();

  TransferDocument createTransferDocument(String documentType);
}
