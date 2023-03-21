package Assienment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Spring;

public class Priblem1 {

	public static void main(String[] args) {
		
		add("The patient should be informed of his therapeutic options.");

		add("It wouldn't be as if the lone astronaut would be completely by himself.");

		add("Now, a writer is entitled to have a Roget on his desk.");

		add("Somebody should let you borrow their book");

		add("From the earliest times until about the 1960s");

		add("whether we may not, nay ought not, to use a neutral pronoun relative");

		add("phone 9280018281");

		add("Notionalplurality");

		add("A starting point would be to give more support");

		add("abc@gmail.com");

	}

	public static   void add(String Search){ 
		int c1=0; 
		Pattern p = Pattern.compile(Search);  
		
		 Matcher  m = p.matcher(".*\\.$\r\n"); 
		 while(m.find()){ 
			  c1 = c1+1; 
			   System.out.println("satement is :"+ m.group()+"at index "+ m.start()+ " "+ Search);

		 }
		 System.out.println("satement is :"+ m.group()+"at index "+ m.start()+ " "+ Search);
		 System.out.println(c1);

		}

		 

		 

}
