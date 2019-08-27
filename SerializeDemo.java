import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class SerializeDemo {
	public static void main(String[] args){
		Employeee e=new Employeee();
		e.name="Micheal Khan";
		e.address="Castle Street, Bangalore";
		e.SSN=11122333;
		e.number=101;
		try{
			FileOutputStream fileOut = new FileOutputStream("d:/abc/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
			
		}catch(IOException i){
			i.printStackTrace();
		}
	}

}
