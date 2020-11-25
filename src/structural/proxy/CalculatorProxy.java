package structural.proxy;

public class CalculatorProxy implements Calculator {

  private final Calculator realCalculator;

  public CalculatorProxy(Calculator realCalculator) {
    this.realCalculator = realCalculator;
  }

  @Override
  public int add(int number1, int number2) {
    System.out.println("Proxy add");
    return realCalculator.add(number1, number2);
  }

  @Override
  public int subtract(int number1, int number2) {
    System.out.println("Proxy subtract");
    return realCalculator.subtract(number1, number2);
  }

  @Override
  public int multiply(int number1, int number2) {
    System.out.println("Proxy multiply");
    return realCalculator.multiply(number1, number2);
  }

  @Override
  public int divide(int number1, int number2) {
    if (number2 == 0) {
      throw new IllegalArgumentException("Proxy error in division");
    }
    System.out.println("Proxy divide");
    return realCalculator.divide(number1, number2);
  }
}
