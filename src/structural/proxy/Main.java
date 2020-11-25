package structural.proxy;

public class Main {

  public static void main(String[] args) {
    //Use-Case: control the usage of a target object

    //The real CalculatorImpl is wrapped inside CalculatorProxy which acts also as a Calculator
    Calculator calculator = new CalculatorProxy(new CalculatorImpl());

    System.out.println(calculator.add(4, 4));
    System.out.println(calculator.subtract(4, 2));
    System.out.println(calculator.multiply(4, 4));
    System.out.println(calculator.divide(4, 2));
    System.out.println(calculator.divide(4, 0));
  }
}
