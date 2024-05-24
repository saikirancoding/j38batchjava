package com.finaldemo;
//final with variable

/*
public class TestFinalDemo {

	final  int x=5;
	void find()
	{
	//	x=x+10;//It show error because x is constant
		System.out.println(x);
	}
	public static void main(String[] args) {
	
		TestFinalDemo ob=new TestFinalDemo();
		ob.find();

	}

}
*/
//Final method:

/*
class DemoFinal
{
	final void find()
	{
		System.out.println("Parent method");
	}
}

public class TestFinalDemo extends DemoFinal {

	
	//void find()//It shows error becoz it is final method which cannot override
	//{
	//	System.out.println("Child method");
	//}
	public static void main(String[] args) {
	
		TestFinalDemo ob=new TestFinalDemo();
		ob.find();

	}

}
*/

//final class:can not inherit 

/*
final class DemoFinal
{
	final void find()
	{
		System.out.println("Parent method");
	}
}


public class TestFinalDemo extends DemoFinal {

	
	
	public static void main(String[] args) {
	
		TestFinalDemo ob=new TestFinalDemo();
		ob.find();

	}

}
*/