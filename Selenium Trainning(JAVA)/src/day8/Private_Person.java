package day8;

public class Private_Person {
	
	private static String name;//private used for restricted access
	
	
	public static String getName() {
		
		return name;
	}
	

    public static void setName(String name) {
		Private_Person.name = name;
	}

      public static void main(String[] args) {
		Private_Person obj =new Private_Person();
		
		setName("Pratibha");
             System.out.println(getName());
	}

}
