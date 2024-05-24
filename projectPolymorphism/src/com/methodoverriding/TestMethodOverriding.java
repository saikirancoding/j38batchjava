package com.methodoverriding;

class Vehicle
{
	void getEngine() {
		System.out.println("Vehicle Engine");
	}

}
class Car extends Vehicle
{
	void getEngine() {
		
		System.out.println("Car Engine");
	}
}
public class TestMethodOverriding {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.getEngine();
	}

}
