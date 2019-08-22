import java.util.*;

public class TestArrayList21 {
	public static void main(String args[]){
		List<String> a1=new ArrayList<String>();
		a1.add("Jim");
		a1.add("Micheal");
		a1.add("James");
		a1.add("Andy");
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
