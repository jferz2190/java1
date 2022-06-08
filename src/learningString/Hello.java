package learningString;

import java.util.Scanner;

public class Hello {
		
	public static void main(String[] args) {
//		
//		//variable
//		String msg = "Hello";
//		System.out.println(msg);
	
		
		Scanner ui = new Scanner(System.in);//whenever I want to take input from user I will have to create scanner class object
		Scanner ui2 = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = ui.nextLine();
		
		System.out.println("Hello, " + name);
		 System.out.println("Do you go to college?");
		// boolean b = ui2.nextBoolean();
	
		 
		 ui.close();
		 ui2.close();
	}
	
	

}
