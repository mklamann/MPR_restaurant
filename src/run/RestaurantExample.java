package run;

import java.sql.Connection;

import repo.IDatabaseCatalog;
import domain.Restaurant;

public class RestaurantExample {
	

	public static void run(Connection connection,IDatabaseCatalog catalog){
		
		catalog.restaurant().createTable();
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Pizzeria");
		restaurant.setAddress("Pruszcz Gdański");
		restaurant.setPhone("123456789");
		
		catalog.restaurant().add(restaurant);
	}
}
