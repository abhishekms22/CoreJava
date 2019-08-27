import java.util.*;
//import java.util.Set;

public class TreeMapDemo {
	public static void main(String args[]){
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		
		Set set= tmap.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry mentry = (Map.Entry)i.next();
			System.out.println("Key is :"+mentry.getKey()+ " & value is : ");
			System.out.println(mentry.getValue());
		}
	}
}
