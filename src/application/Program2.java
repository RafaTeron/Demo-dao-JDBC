package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("---- TEST 1 : findById ----");
		Department department = departmentDao.findById(2);
		System.out.println(department);

	}

}
