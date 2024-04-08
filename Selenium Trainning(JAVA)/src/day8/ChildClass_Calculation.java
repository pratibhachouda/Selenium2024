package day8;

public class ChildClass_Calculation extends Inheritance_BaseClass{
	int z;
	
	public void multipication(int pratibha,int saurabh) {
		z = pratibha*saurabh;
		System.out.println("Product:"+z);
			}

	public static void main(String[] args) {
		// I want to call Addition,Subtraction	
		   int x=5;
		   int y=20;
		   
		   
		ChildClass_Calculation calcobj =new ChildClass_Calculation();
		  
		calcobj.add(x, y);
		calcobj.sub(x, y);
		calcobj.multipication(x, y);
	}

}
