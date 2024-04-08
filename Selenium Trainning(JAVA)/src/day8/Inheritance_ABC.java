package day8;

class A
{
     int x;
     int y;
   public void add () {
	      
	System.out.println(x+y);
	   
   } 
   
	
}

class B extends A
{       int a;
       int b;
    public void subtraction()
    {
    	System.out.println(a-b);
    }
    	
}        


class C extends B
{
	 int p;
	 int q;
	 public void product() {
		 System.out.println(p * q);
		 
	 }
		 
	 }
	 



public class Inheritance_ABC {

	public static void main(String[] args)
	{
	
	/*A aobj=new A();
	aobj.x=10;
	aobj.y=20;
	aobj.add();8*/	
	
	/*B bobj=new B();
	bobj.a=100;
	bobj.b=50;
    bobj.subtraction();		
    
    bobj.x=30;
    bobj.y=10;
    bobj.add();*/
    
    C cobj=new C();
    cobj.p=10;
    cobj.q=10;
    cobj.a=100;
    cobj.b=10;
    cobj.x=10;
    cobj.y=10;
    cobj.add();
    cobj.subtraction();
    cobj.product();
    		
	
	}


}
