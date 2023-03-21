package Compa;

import java.util.ArrayList;
import java.util.List;

public class Runmain {
public static void main(String[] args) {
	Employee e1=new Employee(1,"Raju",18, new Address("16 main road bangalore", 43));
	
	
	System.out.println(e1);
	
	List<Employee> emp=new ArrayList<Employee>();
	emp.add(e1);
	System.out.println(e1);
}
}
