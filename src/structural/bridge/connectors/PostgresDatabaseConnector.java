package structural.bridge.connectors;

public class PostgresDatabaseConnector implements DatabaseConnector {

  @Override
  public void persist(Object o) {
    System.out.println("Persisting object " + o.toString() + " in Postgres way");
  }
}
