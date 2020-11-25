package structural.adapter.composition;

import java.util.ArrayList;
import java.util.List;
import structural.adapter.composition.converters.DashedConverter;
import structural.adapter.composition.converters.DashedConverterImpl;
import structural.adapter.composition.converters.UnderscoreConverterImpl;

public class Main {

  public static void main(String[] args) {
    //Use-Case: make incompatible interfaces work together

    //DashedConverterAdapter seems to be a DashedConverter but makes Underscores instead
    List<DashedConverter> converters = new ArrayList<>();
    converters.add(new DashedConverterImpl());
    converters.add(new DashedConverterAdapter(new UnderscoreConverterImpl()));

    converters.forEach(converter -> converter.makeDashed("Hello Composition"));
  }

}
