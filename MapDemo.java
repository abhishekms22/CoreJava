import java.util.*;
public class MapDemo {
	public static void main(String[] args){
		Map<String, String> mapCountryCodes = new HashMap<>();
		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("2", "India");
		
		Set<String> setCodes = mapCountryCodes.keySet();
		Iterator<String> iterator = setCodes.iterator();
		
		while(iterator.hasNext()){
			String code = iterator.next();
			String country=mapCountryCodes.get(code);
			System.out.println(code + "=>" + country );
		}
		System.out.println(mapCountryCodes.get("2"));
	}
}
