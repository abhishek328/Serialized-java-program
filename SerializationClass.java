import java.util.Scanner;
import java.io.*;
/**
 * 
 * @author Abhishek Bansal
 *
 */
public class SerializationClass {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		
		System.out.println("do you want to add a new employee");
		System.out.println("press 1 or 0 ");
		int num = scan1.nextInt();
		
		if(num == 1)
		{
			
			String name = scan2.nextLine();
			String vertical = scan2.nextLine();
			String team_name = scan2.nextLine();
			int emp_id = scan1.nextInt(); 
			int salary = scan1.nextInt();
			
            Emp Abhishek  = new Emp ();
			
			Abhishek.set(name, vertical , team_name, emp_id , salary);
		
		     Abhishek.addEmp (Abhishek);
		}
		
	}

}
