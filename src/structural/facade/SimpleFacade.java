package structural.facade;

import structural.facade.complexsubsystems.ComplexCalculationSubsystem;
import structural.facade.complexsubsystems.ComplexStringManipulationSubsystem;

public class SimpleFacade {

  private final ComplexCalculationSubsystem calculationSystem;
  private final ComplexStringManipulationSubsystem stringSystem;

  public SimpleFacade(ComplexCalculationSubsystem calculationSystem,
      ComplexStringManipulationSubsystem stringSystem) {
    this.calculationSystem = calculationSystem;
    this.stringSystem = stringSystem;
  }

  public String boxDashed(String s) {
    return stringSystem.box("-", s, "-");
  }

  public int add(int number1, int number2) {
    return calculationSystem.calculate(number1, number2, 1);
  }

  public int subtract(int number1, int number2) {
    return calculationSystem.calculate(number1, number2, 2);
  }

  public int multiply(int number1, int number2) {
    return calculationSystem.calculate(number1, number2, 3);
  }

  public int divide(int number1, int number2) {
    if (number2 == 0) {
      throw new IllegalArgumentException("divisior may not be 0");
    }
    return calculationSystem.calculate(number1, number2, 4);
  }
}
