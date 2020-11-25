package structural.adapter.composition.converters;

public class DashedConverterImpl implements DashedConverter {

  @Override
  public void makeDashed(String s) {
    System.out.println("-" + s + "-");
  }
}
