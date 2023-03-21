 class Person{
	  Person() {
	System.out.println("Person Class");
	}
	  Person(int i) {
		  super();
			System.out.println("Person Class 1");
			}
	  Person(long l) {
		  super();
			System.out.println("Person Class 2");
			}
}
public class Constructorthis extends Person {

	Constructorthis (){
		 
		System.out.println("Constrictoer this");
	}
	public static void main(String[] args) {
		Constructorthis c=new Constructorthis();
		Person p=new Person(10);
	}
}
 