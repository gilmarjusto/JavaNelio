package entities;

public class EmployeeEncapsulado {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeEncapsulado(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setIncreaseSalary(Double pIncrease) {
		if (pIncrease > 1.00) {
			pIncrease = pIncrease / 100; 
		}
				
		this.salary = this.salary + this.salary * pIncrease;
	}
	
	
	

}
