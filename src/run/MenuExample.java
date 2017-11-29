package run;

import java.sql.Connection;

import repo.IDatabaseCatalog;
import domain.Menu;

public class MenuExample {

public static void run(Connection connection,IDatabaseCatalog catalog){
		
		catalog.menu().createTable();
		
		Menu menu = new Menu();
		menu.setType("Śniadanie");

		
		catalog.menu().add(menu);
	}
}
