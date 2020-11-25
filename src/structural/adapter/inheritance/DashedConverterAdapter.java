package structural.adapter.inheritance;

import structural.adapter.inheritance.converters.DashedConverter;
import structural.adapter.inheritance.converters.DashedConverterImpl;

public class DashedConverterAdapter extends DashedConverterImpl implements DashedConverter {

  @Override
  public void makeDashed(String s) {
    System.out.println("_" + s + "_");
  }
}
