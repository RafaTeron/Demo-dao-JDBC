package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("---- TEST 1 : findById ----");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n---- TEST 2 : findAll ----");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n---- TEST 3 : insert ----");
		Department newDepartment = new Department(null, "Mobile");
		departmentDao.insert(newDepartment);
		System.out.println("Insert new id = " + newDepartment.getId());
		
		System.out.println("\n---- TEST 4 : update ----");
        department = departmentDao.findById(5);
        department.setNome("Food");
        departmentDao.update(department);
        System.out.println("Update Finalizado! ");
        
        System.out.println("\n---- TEST 5 : delete ----");
        System.out.print("Insira um Id para ser deletado : ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
     	System.out.println("Id Deletado");

        sc.close();
	}

}
