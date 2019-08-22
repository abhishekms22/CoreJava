import java.io.FileWriter;

public class ThrowsFile {
	public static void main(String[] args)throws Exception{
		FileWriter file=new FileWriter("c:\\Data1.txt");
		file.write("Java 9");
		file.close();
	}
}
