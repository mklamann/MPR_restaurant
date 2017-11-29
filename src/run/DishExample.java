package run;

import java.sql.Connection;

import repo.IDatabaseCatalog;
import domain.Dish;

public class DishExample {

public static void run(Connection connection,IDatabaseCatalog catalog){
		
		catalog.dish().createTable();
		
		Dish dish = new Dish();
		dish.setName("Serowa");
		dish.setDescription("4 rodzaje sera");
		dish.setPrice(14);
		
		catalog.dish().add(dish);
	}
}
