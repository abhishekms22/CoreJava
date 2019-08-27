import java.io.Serializable;

public class Employeee implements Serializable {
	public String name;
	public transient String address;
	public transient int SSN;
	public int number;
//	public String address;
	
}
