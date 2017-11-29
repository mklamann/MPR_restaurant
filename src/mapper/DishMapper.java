package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Dish;

public class DishMapper implements IMapper<Dish> {
	
	@Override
	public Dish map(ResultSet rs) throws SQLException {
		Dish p = new Dish();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setDescription(rs.getString("description"));
		p.setPrice(rs.getFloat("price"));
		return p;
	}
}
