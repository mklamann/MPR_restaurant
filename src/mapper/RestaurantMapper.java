package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Restaurant;

public class RestaurantMapper implements IMapper<Restaurant>{
	
	@Override
	public Restaurant map(ResultSet rs) throws SQLException {
		Restaurant p = new Restaurant();
		p.setId(rs.getInt("id"));
		p.setName(rs.getString("name"));
		p.setAddress(rs.getString("address"));
		p.setPhone(rs.getString("phone"));
		return p;
	}
}
