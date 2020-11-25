package structural.proxy;

public class CalculatorImpl implements Calculator {

  @Override
  public int add(int number1, int number2) {
    return number1 + number2;
  }

  @Override
  public int subtract(int number1, int number2) {
    return number1 - number2;
  }

  @Override
  public int multiply(int number1, int number2) {
    return number1 * number2;
  }

  @Override
  public int divide(int number1, int number2) {
    return number1 / number2;
  }
}
