package repo;

import java.util.List;

import repo.IRepository;
import domain.Menu;

public interface IMenuRepository extends IRepository<Menu> {
	
	public List<Menu> withType(String type);
	public List<Menu> withId(String id);
	
}
