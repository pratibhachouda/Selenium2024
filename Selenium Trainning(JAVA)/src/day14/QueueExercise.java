package day14;
import java.util.*;
public class QueueExercise {

	public static void main(String[] args) {
		// Queue is an interface
		//Instantiate Queue
		//Priority Queue does not allow any null value
		//Priority is a class that comes from Queue interface
		
		Queue<String> que1 = new PriorityQueue<>();
		
		System.out.println(que1.isEmpty());
		que1.add("mom");
		que1.add("dad");
		que1.add("brother");
		que1.add("1");
		que1.add("sister");
		
		System.out.println(que1);
	    System.out.println(que1.peek());
		System.out.println(que1.isEmpty());
	    System.out.println(que1.size());
		
		for(String ques :que1) {
			System.out.println(ques);
			
	
	
	
		}
			
	    
	   
	    
	}

}
