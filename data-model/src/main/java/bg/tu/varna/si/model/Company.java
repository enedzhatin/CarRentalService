package bg.tu.varna.si.model;


import java.util.List;

public class Company {
	private long id;
	
	private String name;
	
	private List <User> employees;
	
	private List<Car> cars;
	
	public Company() {}
	
	public Company(String name, List<User> employees, List<Car> cars) {
		super();
		this.name = name;
		this.employees = employees;
		this.cars = cars;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getEmployees() {
		return employees;
	}

	public void setEmployees(List<User> employees) {
		this.employees = employees;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
