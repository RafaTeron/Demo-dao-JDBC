package model.entities;

import java.util.Date;

public class Seller extends Departament {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	public Seller() {
		super();
	}

	public Seller(Integer id, String nome,String email, Date birthDate, Double baseSalary) {
		super(id , nome);
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


}
