package repo;

import java.util.List;

import repo.IRepository;
import domain.Restaurant;

public interface IRestaurantRepository extends IRepository<Restaurant> {

	public List<Restaurant> withId(String id);
}
