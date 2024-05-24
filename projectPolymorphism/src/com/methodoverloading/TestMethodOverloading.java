package com.methodoverloading;

class Shape
{
		public void area(int x)
		{
			System.out.println("Square area="+(x*x));
		}
		
		public void area(int x,int y)
		{
			System.out.println("Rectangle area="+(x*y));
		}
		
		public void area(float x)
		{
			System.out.println("Circle area="+(3.14f *x *x));
		}
		
}

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		Shape shape=new Shape();
		shape.area(2.3f);
		shape.area(2, 3);
		shape.area(2);

	}

}
