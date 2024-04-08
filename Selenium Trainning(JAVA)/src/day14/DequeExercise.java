package day14;
import java.util.*;
public class DequeExercise {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<>();
		  dq.add(3);
		  dq.addLast(4);
		  dq.addFirst(2);
		  dq.offerFirst(1);
		  dq.addFirst(0);
		  dq.addLast(5);
		  dq.add(6);
		  dq.addLast(20);
		  dq.addFirst(10);
		  System.out.println("Deque List:"+dq);
		  System.out.println("First Element Removed:" +dq.pollFirst());
		  System.out.println("Deque List:"+dq);
		  System.out.println("Last Element Removed:" +dq.pollLast());
		  System.out.println("Deque List:"+dq);
	}

}
