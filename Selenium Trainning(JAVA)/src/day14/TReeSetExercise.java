package day14;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
public class TReeSetExercise {

	public static void main(String[] args) {
		 TreeSet<String> tset = new TreeSet<>();
           tset.add ("cow");
           tset.add ("Horse");
           tset.add ("Dog");
           tset.add ("cat");
           tset.add ("Goat");
           tset.add ("cat");
           tset.add ("Dog");
           tset.add ("Animal List");
           Iterator<String> itr =tset.iterator();
           while(itr.hasNext()) {
        	   System.out.println(itr.next());
        	   System.out.println(tset.first());
           }
         {
        	TreeSet<Integer>  tset1 = new  TreeSet<>();
        	tset1.add(10);
        	tset1.add(5);
        	tset1.add(2);
        	tset1.add(10);
        	tset1.add(4);
        	tset1.add(8);
        	Iterator<Integer> itr1 =tset1.iterator();
        	while (itr1.hasNext()) {
        		System.out.println(itr1.next());
        	}
        	   
           }
         Map map = new HashMap();
         Set set = map.entrySet();
         //map.clear();
           System.out.println(map.containsKey(2));
           System.out.println(map.containsValue("Ahaan"));
           System.out.println(map.get(1));
           Iterator itr1 = set.iterator();
           while(itr1.hasNext()) {
           	
           	
           	Map.Entry entry = (Map.Entry)itr1.next();
           	System.out.println(entry.getKey()+" "+entry.getValue());  
        	  }

}
}
