package day6;

public class CreatingObject {
     static  int x=9;
     static  int y=3;
 public static void main(String[] args) {
		// TODO Auto-generated method stub
                
	//Creating Object or instance of class
	 
	 CreatingObject creatobj = new CreatingObject();
	 CreatingObject creatobj2 = new CreatingObject();
	 System.out.println(creatobj.x);
	 System.out.println(creatobj.y);
	 System.out.println(creatobj.subtraction(x, y));

	 
	 
	}
 public static int subtraction(int x,int y) {
		  int z= x-y;
		  return z;

}
}