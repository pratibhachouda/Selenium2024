package day13;
import java.util.*;

public class LinkedListExercise {

	public static void main(String[] args) {
		LinkedList<String> linkedlist= new LinkedList<String>();
		linkedlist.add("You");
		linkedlist.add("can");
		linkedlist.add("do");
		linkedlist.add("it");
		
		
		LinkedList<Integer> linkedlist2= new LinkedList<Integer>();
		linkedlist2.add(10);
		linkedlist2.add(20);
		linkedlist2.add(30);
		linkedlist2.add(40);
		
		linkedlist2.remove(1);//remove Method
		 
		linkedlist.add("Yes");//Add Method
		
		linkedlist.addFirst("Ofcourse");//AddFirst method
		
		linkedlist.add(1, "***"); //index adding method
		
	   
	
			Iterator itr=linkedlist.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("--------------");
			Iterator itr2=linkedlist2.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}	
	}
	

}
