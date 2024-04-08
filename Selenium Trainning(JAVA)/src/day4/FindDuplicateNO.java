package day4;

import java.util.Arrays;

public class FindDuplicateNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Numbers 3 4 5 6 7 8 4 6 7 8
		// Find duplicate no in Array.
		// Approach 1: Sort the Number 3 4 4 5 6 6 7 7 8 8 duplicate is =4 6 7 8
		//step 1 Sorted
		//step 2 Iterate
		//step 3 Compare with next number
		
		int[] numbers = {3,4,3,5,6,7,8,4,6,8};
		
        Arrays.sort(numbers);
		//if you don't give length_1,then it will end in error index out of error.
        
        
        
        for (int i=0;i<numbers.length-1;i++){
        
		if(numbers[i]==numbers[i+1]) {
        System.out.println("Duplicate:"+numbers[i]);
       	
        
       }
        
        
        }
	}

}
