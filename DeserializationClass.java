import java.io.*;
public class DeserializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp emp1 = null;
		
		try
		{
		FileInputStream fileIn = new  FileInputStream ("E:\\Files\\Airtel\\e.name ");
		ObjectInputStream in = new ObjectInputStream (fileIn);
		emp1 = (Emp) in.readObject();
		//emp2 = (Emp) in.readObject();
		in.close();
		fileIn.close();
		}
		finally
		{
			System.out.println("Deserializing Employee......");
			emp1.getEmp_data();
			
		}
		
		
		

	}

}
