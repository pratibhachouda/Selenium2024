package day12;

abstract class Vehicle1
{
	abstract void start();
}
class Car extends Vehicle1
{
 void start() 
    {
	System.out.println("Car start with Key");
    }
 }

class Scooter extends Vehicle1
{
	 void start()
	{
	System.out.println("Scooter start with key");	
	
	}
	 
	public static void main(String[] args)
	{
		Car c=new Car();
		c.start();
		Scooter s=new Scooter();
		s.start();
	}
}


