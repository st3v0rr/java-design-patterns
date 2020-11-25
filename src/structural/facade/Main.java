package structural.facade;

import structural.facade.complexsubsystems.ComplexCalculationSubsystem;
import structural.facade.complexsubsystems.ComplexStringManipulationSubsystem;

public class Main {

  public static void main(String[] args) {
    //Use-Case: make interfaces more easy and usable

    //SimpleFacade provides a more easy API of ComplexCalculationSubsystem and ComplexStringManipulationSubsystem
    SimpleFacade simpleFacade = new SimpleFacade(new ComplexCalculationSubsystem(),
        new ComplexStringManipulationSubsystem());

    System.out.println(simpleFacade.boxDashed("hello world"));
    System.out.println(simpleFacade.add(4, 4));
    System.out.println(simpleFacade.subtract(4, 2));
    System.out.println(simpleFacade.multiply(4, 4));
    System.out.println(simpleFacade.divide(4, 2));
    System.out.println(simpleFacade.divide(4, 0));
  }

}
