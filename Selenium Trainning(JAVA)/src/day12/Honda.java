package day12;

public class Honda extends Bike{

	private static final char[] Bike = null;
	private static Object run;

	public static void main(String[] args) {
		Bike bikeobj=new Honda ();//objected provided through method ex;- run
		bikeobj.run();

	}

	
	public void run() {
		System.out.println("i can go upto speed 100km p/h");
		
	}

}
