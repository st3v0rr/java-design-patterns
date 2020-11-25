package structural.bridge.connectors;

public class H2DatabaseConnector implements DatabaseConnector {

  @Override
  public void persist(Object o) {
    System.out.println("Persisting object " + o.toString() + " in H2 way");
  }
}
