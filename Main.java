 

public class Main implements Runnable{
	public static void main (String [] args){
		
		Thread t1=new Thread("Raju");
		Thread t2=new Thread("Kumar");
//		
		t1.start();
		t2.start();
		
		System.out.println("Thread name are follwing");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
     
    
}
