package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
      public static void main(String[] args) {
		//map is an interface,which implements Map & Sorted Map
		//Map works on Key and Value
		//It has 3 classes(HashMap,LinkedHashmap,TreeMap),Instantiating
	Map map =new HashMap();
	map.put(6, "Pratibha");
	map.put(2, "Saurabh");
	map.put(3, "Advik");
	map.put(4, "Ahaan");
	map.put(1, "Swati");
	//Traversing Map is not possible directly using iterator
	//so convert to set so we can traverse
	Set set = map.entrySet();
	//map.clear();
	System.out.println(map.containsKey(2));
	System.out.println(map.containsValue("Ahaan"));System.out.println(map.get(1));
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		//Converting to Map.entry so we can get the Key and value seprately
		Map.Entry entry = (Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	
	}
	}

}
