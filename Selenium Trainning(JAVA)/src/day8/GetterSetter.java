package day8;

public class GetterSetter {

	String Name;
	int Age ;
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	    public static void main(String[] args) {
		
              GetterSetter getset = new GetterSetter();
              getset.setAge(30);
               getset.setName("Pratibha");
               System.out.println(getset.getName());
               System.out.println(getset.getAge());

	}

}
