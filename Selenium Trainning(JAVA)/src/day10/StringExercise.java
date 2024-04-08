package day10;

public class StringExercise {
	public static String str1;

	
	//string are sequence of character
	//strings are immutable,which means constant
	//strings can't change one created
	//strings are specified to immutable,contend shared storage in a single pool
	                                         //to minimize creating copy of same value
	public static void main(String[] args) {
	String S1="Hello";
	System.out.println(S1);
	String s2="Hello";
	System.out.println(s2);
    String s3 =new String("Hello");
    System.out.println(s3);
	}

	
	
	
	
}
