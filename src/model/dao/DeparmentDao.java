package model.dao;

import java.util.List;

import model.entities.Department;

public interface DeparmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findByid(Integer id);
	List<Department> findAll();
}
