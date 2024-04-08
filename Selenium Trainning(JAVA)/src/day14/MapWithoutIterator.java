package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapWithoutIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map =new HashMap();
		map.put(1, "Pratibha");
		map.put(2, "Saurabh");
		map.put(3, "Advik");
		map.put(4, "Ahaan");
		map.put(5, "Swati");
		map.put(5, "mom");
		map.put(null, null);
		map.put(null," Swati");
		map.put(7, null);
		map.put(8, null);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Ahaan"));System.out.println(map.get(1));
		
			
System.out.println(map);
		
		}
		}

	