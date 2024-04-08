package day14;
import java.util.Enumeration;
import java.util.Hashtable;
public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "Anita");
		ht.put(100, "Rashmi");
		ht.put(103, "Manu");
		ht.put(105, "Richa");
		ht.put(109, "Kiran");
		ht.put(107, "Kiran");
		//ht.put(106, null);
		//ht.put(null, null);
		//ht.put(null, "Rekha");
		System.out.println(ht);
		System.out.println(ht.get(103));
	ht.remove(109);
	System.out.println(ht);
	 // Enumeration the element of hashtable
	Enumeration<Integer> Keys = ht.keys();
	
	while(Keys.hasMoreElements()){
		Integer Key = Keys.nextElement();
		System.out.println("Key:"+ " "   +Key +" " + "Value:" +" "+ ht.get(Key));
	}
	
	
		
	}

}
