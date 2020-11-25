package structural.bridge.repositories;

import structural.bridge.connectors.DatabaseConnector;

public class RepositoryImpl implements Repository {

  private final DatabaseConnector databaseConnector;

  public RepositoryImpl(DatabaseConnector databaseConnector) {
    this.databaseConnector = databaseConnector;
  }

  @Override
  public void save(Object o) {
    System.out.println("Saving " + o.toString());
    databaseConnector.persist(o);
  }
}
