package day5;

public class StringReverseSentance {

	public static void main(String[] args) {
		String str= "mona naaha";
		//reverse string		
	    //pseudocode
		//how to put each character
		//traverse right to left
		//the concatenate each character inside the loop to make word	
				
     char[]everychar=str.toCharArray();
		
		for(int i=everychar.length-1;i>=0;i--){
			System.out.print(everychar[i]);
		}
				
				
				
		
		
	
	}
	
}
