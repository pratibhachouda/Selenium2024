package day8;

public class ClassB extends ClassA{
 // with the use of super key u can print parent class variable value   
//this key is used to print current class value
	//if u create a object show (i)will print the value with u define in object//
	int i= 20;
	void show(int i) {
System.out.println(super.i);
System.out.println(i);
System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		ClassB ob=new ClassB();
		ob.show(50);
		
	}

}
