package creational.abstractfactory.model;

public class SoapTransferTechnology implements TransferTechnology {

  @Override
  public String getName() {
    return "SOAP";
  }
}
