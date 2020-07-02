import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Emp implements Serializable {
	 String name;
	 String vertical;
	 String team_name ;
	 Emp rm;
	 Emp buddy;
	 int emp_id, salary ;
	 enum Designation {software_engg , senior_software_engg , leader , head , ceo };
    
	/* default constructor */
	public Emp ()
	{
		this.name = "null";
		this.vertical = "null";
		this.team_name = "null" ;
		this.emp_id = -1;
		this.salary= -1;
	}
	
	/* parametrized  constructor */
	
	public Emp ( String name ,  String vertical , String team_name , int emp_id , int salary)
	{
		this.name = name;
		this.vertical = vertical;
		this.team_name = team_name;
		this.emp_id = emp_id;
		this.salary = salary;
	}
	
	/* setter function */
	public void set (String name ,  String vertical , String team_name , int emp_id , int salary ) 
	{
		this.name = name;
		this.vertical = vertical;
		this.team_name = team_name;
		this.emp_id = emp_id;
		this.salary = salary;
		
		
	}
	public void getEmp_data ()
	{
		System.out.println("Employee name is : "+ name);
		System.out.println("Employee vertical is : "+ vertical);
		System.out.println("Employee team_name is : "+ team_name);
		System.out.println("Employee emp_id is : "+ emp_id);
		System.out.println("Employee salary is : "+ salary);
		
	}
	public void setRm (Emp rm)
	{
		this.rm = rm ;
		
	}
	public void setBuddy (Emp buddy)
	{
		this.buddy = buddy ;
		
	}
	public void getRM_Buddy()
	{
		
	}
	
	public void addEmp (Emp e) 
	{
		
		/* this function is implement in Serializable Class */
		
		try
		{
			FileOutputStream fileOut = new  FileOutputStream ("E:\\Files\\Airtel\\e.name" , true);
			ObjectOutputStream out = new ObjectOutputStream (fileOut);
			
			
			
			
			// Abhishek.setRm(Abhishek);
			// Abhishek. setBuddy(Abhishek);
			
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialize data is saved in Airtel.txt file");
			
		}
		catch (IOException k)
		{
			k.printStackTrace();
		}
		
	}
	
	public void removeEmp (Emp e) throws Exception
	{
		
		/*new FileOutputStream(E:\\Files\\Airtel\\e.name).close();
		File f = new File(E:\\Files\\Airtel\\e.name);
		if(f.delete())
		{
			System.out.println("Employee Removed!");
		}
		*/
	}
	
	
	
}
