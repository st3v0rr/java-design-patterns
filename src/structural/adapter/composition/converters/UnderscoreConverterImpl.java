package structural.adapter.composition.converters;

public class UnderscoreConverterImpl implements UnderscoreConverter {

  @Override
  public void makeUnderscored(String s) {
    System.out.println("_" + s + "_");
  }
}
