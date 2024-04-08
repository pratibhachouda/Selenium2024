package day5;

public class StringReverseWord {

	public static void main(String[] args) {
		// Reverse String Word
		
		//pseudocode
		//Convert String into Words amazon/development/center
		//Traverse from right to left....nozama/tnempoleved/retnec
		//keep printing with white space between them
		
		String company = "Amazon Devlopment Center";
		
		
		String[]words= company.split(" ");
		
	    for(int i=words.length-1;i>=0;i--) {
	    	System.out.println(words[i]+" ");
	    }
		
		
	}

}

