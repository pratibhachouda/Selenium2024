package day13;
import java.util.*;




public class Collections {

	public static void main(String[] args) {
		//ArrayList,LinkedList,vector,stack
	    // to instantiate the list interface
		/*
		 * List<String> list1 =new ArrayList<>(); List<Integer> list2 = new
		 * LinkedList<>(); List<String> list3 = new Vector<>(); List<Integer> list4 =
		 * new Stack<>();
		 */
		ArrayList<String> nameList = new ArrayList<String>();//creating arraylist obj
		nameList.add("pratibha");
		nameList.add("saurabh");
		nameList.add("advik");
		nameList.add("ahaan");
		nameList.add("mona");
		System.out.println(nameList.size());
		
		Iterator itr = nameList.iterator();//Traversing list Through Iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
