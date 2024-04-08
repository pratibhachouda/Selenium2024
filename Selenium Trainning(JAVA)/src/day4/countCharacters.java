package day4;

public class countCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count the character in given string
	 String name = "ahan";
	 //total character =8
	 //want to find occurance/count a is present in given input string
	 //want to find couny a=2
	 
	 char searchchar = 'a';
	 int count =0;
	 //p|r|a|t|i|b|h|a
	 
	 char [] charArray = name.toCharArray();
	
	 for(int i=0;i<charArray.length;i++) {
		 
		 
		 if(charArray[i]==searchchar) {
			  count =count+1;
			 
		 }
	 }
	System.out.println(count);		 
	 
		
		
		

	}

}
