package day4;

public class CountExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String Baby = "elly";
         char find = 'm';
		 int count =0;
		 char [] charArray = Baby.toCharArray();
		 for(int i=0;i<charArray.length;i++) {
			 if(charArray[i]==find) {
				  count =count+1;
				 
			 }
		 }
		System.out.println(count);		 
		
		
		
		
		

	}

}
