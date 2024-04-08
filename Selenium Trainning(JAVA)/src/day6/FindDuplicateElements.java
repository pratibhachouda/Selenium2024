package day6;

public class FindDuplicateElements {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String[] names= {"Pratibha","Saurabh","Advik","Ahaan","Pratibha","Saurabh"};
		
       for(int i=0;i<names.length;i++) {
    	   
    	   for(int j=i+1;j<names.length;j++) {
    		   if (names[i].equals(names[j])) {
    			   System.out.println("Duplicate Names:"+names[i]);
    		   }
    	   }
       }
	}

}
