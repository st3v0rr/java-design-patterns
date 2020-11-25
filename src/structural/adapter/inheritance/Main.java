package structural.adapter.inheritance;

import java.util.ArrayList;
import java.util.List;
import structural.adapter.inheritance.converters.DashedConverter;
import structural.adapter.inheritance.converters.DashedConverterImpl;

public class Main {

  public static void main(String[] args) {
    //Use-Case: make incompatible interfaces work together

    //DashedConverterAdapter seems to be a DashedConverter but makes Underscores instead
    List<DashedConverter> converters = new ArrayList<>();
    converters.add(new DashedConverterImpl());
    converters.add(new DashedConverterAdapter());

    converters.forEach(converter -> converter.makeDashed("Hello Inheritance"));
  }

}
