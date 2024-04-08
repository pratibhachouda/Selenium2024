package day4;

public class EvenOddExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
		
		//extracting even no....
		System.out.println("Even no");
		
	          for(int i=0;i<a.length;i++){
			
			if(a[i]%2==0)
		
		        System.out.println(a[i]);
	
	          }

	          System.out.println("Odd no");
	  		
	          for(int i=0;i<a.length;i++){
			
			if(a[i]%2!=0)
		
		        System.out.println(a[i]);
	
	          }
		
		
		
	}

}
