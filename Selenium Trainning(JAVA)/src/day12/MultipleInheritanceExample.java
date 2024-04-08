package day12;
interface A
{
	int A=25;
	void display();
	
}

interface B
{
   int B=50;
   void show();
   
}



public class MultipleInheritanceExample implements A,B
{
    public void display()
     {
     System.out.println(A);
     } 
     public void show()
     {
    System.out.println(B);	 
     }
     
     
		
	
	public static void main(String[] args) {
		MultipleInheritanceExample miobj =new MultipleInheritanceExample();
		  miobj.display();
		  miobj.show();
	}

}
