package repo;

import java.util.List;

import domain.IHaveId;

public interface IRepository<TEntity extends IHaveId> {

	public void add(TEntity entity);
	public List<TEntity> getPage(int offset, int limit);
	public TEntity get(int id);
	public void update(TEntity entity);
	public void delete(TEntity entity);
	public int count();
	public int lastId();
	public void createTable();
}
