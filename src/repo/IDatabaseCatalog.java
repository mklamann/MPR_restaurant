package repo;



public interface IDatabaseCatalog {

	public IRestaurantRepository restaurant();
	public IMenuRepository menu();
	public IDishRepository dish();
	
	
}
