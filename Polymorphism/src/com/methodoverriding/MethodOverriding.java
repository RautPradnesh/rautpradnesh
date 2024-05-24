package com.methodoverriding;

/*class Vehicle
{
	public void display()
	{
		System.out.println("this is a vehicle");
	}
}
class Car extends Vehicle
{
	public void display()
	
	{
		super.display();
		System.out.println("this is a car");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Car c = new Car();
           c.display();
           
	}

}*/

class Vehicle
{
	Vehicle run()
	{         
		return new Vehicle();
	}
}
class Bike
{
	Bike run()
	{
		System.out.println("Bike is Running");
		return new Bike();
	}
	void msg()
	{
		System.out.println("It is Running Safely");
	}
}
public class MethodOverriding{

	public static void main(String[]a)
	{
	Bike b=new Bike();
	b.run().msg();
	}
}