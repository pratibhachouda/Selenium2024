package day5;

public class FindlargestNo {

	public static void main(String[] args) {
		 int a=20,b=10,c=4;
		 
		 int largest1=a>b?a:b;
		 

		 int largest2 = c>largest1?c:largest1;
		 System.out.println(largest2); 
	}

}
