package day7;

public class ConstructorPractise {
     //
	String name; 
	int id;
	public ConstructorPractise (String name,int id){
		System.out.println("Constructor");
		this.name=name;
		this.id=id;
		
				}
	public static void main(String[] args) {
		//creating object,whenever object is created constructor is called

		ConstructorPractise consobj = new ConstructorPractise("mony",30);
		System.out.println("Id:"+consobj.id );
		System.out.println("Name:"+consobj.name);
	}

}
