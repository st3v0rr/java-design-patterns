package structural.facade.complexsubsystems;

public class ComplexCalculationSubsystem {

  public int calculate(int one, int two, int calculationMode) {
    if (calculationMode == 1) {
      return one + two;
    } else if (calculationMode == 2) {
      return one - two;
    } else if (calculationMode == 3) {
      return one * two;
    } else if (calculationMode == 4) {
      return one / two;
    } else {
      return Integer.MAX_VALUE;
    }
  }

}
