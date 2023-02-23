package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Departament obj = new Departament(1,"Book");
		
		Seller seller = new Seller(21 ,"Rafael" ,"rafael.dev@gmail.com",new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}

}
