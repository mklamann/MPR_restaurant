package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Menu;

public class MenuMapper implements IMapper<Menu> {
	
	@Override
	public Menu map(ResultSet rs) throws SQLException {
		Menu p = new Menu();
		p.setId(rs.getInt("id"));
		p.setType(rs.getString("type"));
		return p;
	}
}
