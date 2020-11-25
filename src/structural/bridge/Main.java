package structural.bridge;

import structural.bridge.connectors.DatabaseConnector;
import structural.bridge.connectors.H2DatabaseConnector;
import structural.bridge.connectors.PostgresDatabaseConnector;
import structural.bridge.repositories.Repository;
import structural.bridge.repositories.RepositoryImpl;

public class Main {

  public static void main(String[] args) {
    DatabaseConnector h2Connector = new H2DatabaseConnector();
    DatabaseConnector postgresConnector = new PostgresDatabaseConnector();

    Repository entityRepository1 = new RepositoryImpl(h2Connector);
    entityRepository1.save("entity1");

    Repository entityRepository2 = new RepositoryImpl(postgresConnector);
    entityRepository2.save("entity2");
  }
}
