package impl;

import java.sql.Connection;
import java.sql.SQLException;

import uow.IUnitOfWork;
import repo.*;
import domain.*;
import mapper.*;

public class DatabaseCatalog implements IDatabaseCatalog {

	Connection connection;
	IUnitOfWork uow;
	
	public DatabaseCatalog(Connection connection, IUnitOfWork uow){
		this.connection = connection;
		this.uow = uow;
	}
	
	@Override
	public IRestaurantRepository restaurant() {
		try {
			return new RestaurantRepository(connection, new RestaurantMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public IMenuRepository menu() {
		try {
			return new MenuRepository(connection, new MenuMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public IDishRepository dish() {
		try {
			return new DishRepository(connection, new DishMapper(), uow);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
