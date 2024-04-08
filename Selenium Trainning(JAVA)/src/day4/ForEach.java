package day4;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printarrayelementusingforloop();

}

	public static void printarrayelementusingforloop() {
		String[] Fruits  = {"Banana","Apple","Kiwi","Berries","Mango"};
		
   	//syntax 'for each'
		
    //for( data type of a variable:array name)
		
	
		for(String n :Fruits) {
			if(n.startsWith("M")) {
				
			
			System.out.println(n);
			
			
		}
		
		
		
		
	}
	}
}