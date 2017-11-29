package run;

import impl.DatabaseCatalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import repo.IDatabaseCatalog;
import uow.IUnitOfWork;
import uow.UnitOfWork;


public class App {
	
	public static void main( String[] args ) throws SQLException
    {

    	String url = "jdbc:hsqldb:hsql://localhost/workdb";
    	
    	Connection connection = DriverManager.getConnection(url);
    	IUnitOfWork uow = new UnitOfWork(connection);
    	
    	IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);
    	
    	RestaurantExample.run(connection,catalog);
    	MenuExample.run(connection,catalog);
    	DishExample.run(connection,catalog);   	
    	
    	
    	uow.saveChanges();
        connection.close();
    }
}
