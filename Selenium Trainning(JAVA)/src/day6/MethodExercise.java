package day6;

public class MethodExercise {

	public static void main(String[] args) {
		
		
		
		System.out.println(addition(98,102));
		int a =15, b =10;
		 int sub=subtraction(a,b);
		 System.out.println(sub);
		  System.out.println(additionwithoutparameters());
		 additionwithoutparametersandreturntype();
	}   
      
	public static int addition(int x,int y) {
  	  int z = x+y;
  	  return z;
    }
      
  public static int subtraction(int x,int y) {
	  int z= x-y;
			  return z;
			  
			
  }
    		  
	//method without parameters
  public static int additionwithoutparameters() {
	  int x=500;
	 int y=10;
	 int z =x+y;
	  return z;
	  
	 
  }
       //method without	return type
  
  public static void additionwithoutparametersandreturntype() {
	 int x=50;
	 int y=10;
	 int z =x+y;
	  System.out.println(z);
}
  }

