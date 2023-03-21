package Compa;

public class Employee {

	private int id;
	private String name;
	private int Age;
	private Address address;
	
	
	
	
	public Employee(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.Age = age;
		this.address=address;
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Age=" + Age + ", address=" + address + "]";
	}
	
	 
}
