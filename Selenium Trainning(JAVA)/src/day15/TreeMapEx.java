package day15;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Mumbai");
		map.put(5, "Delhi");
		map.put(4, "Bhopal");
		map.put(3, "Indore");
		map.put(2, "Lucknow");
		
  for(Map.Entry e:map.entrySet()){
	  System.out.println(e.getKey()+ " "+e.getValue());
   }
}
	}

  

