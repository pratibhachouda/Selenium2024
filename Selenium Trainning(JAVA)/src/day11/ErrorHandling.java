package day11;

public class ErrorHandling {

	public static void main(String[] args) {
		
		try {
			int[] number = { 1, 2, 3 };
			System.out.println(number[10]);
		} catch (Exception e) {
			System.out.println("ops something went wrong");
			
		}finally {
			System.out.println("Executing finally Block");
		}
		
	     
	     
	     
		}
}
		
		
