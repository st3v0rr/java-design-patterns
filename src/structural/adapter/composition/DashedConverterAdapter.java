package structural.adapter.composition;

import structural.adapter.composition.converters.DashedConverter;
import structural.adapter.composition.converters.UnderscoreConverter;

public class DashedConverterAdapter implements DashedConverter {

  private final UnderscoreConverter underscoreConverter;

  public DashedConverterAdapter(UnderscoreConverter underscoreConverter) {
    this.underscoreConverter = underscoreConverter;
  }

  @Override
  public void makeDashed(String s) {
    underscoreConverter.makeUnderscored(s);
  }
}
