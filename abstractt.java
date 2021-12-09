package roshan131;

abstract class Shape{
	int i,j;
	
	abstract void printArea();
	
	Shape(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
}

class Rectangle extends Shape{
	Rectangle(int i,int j){
		super(i,j);
	}
	
	void printArea() {
		System.out.println("The area of Rectangle is "+i*j);
	}
}


class Triangle extends Shape{
	Triangle(int i,int j){
		super(i,j);
	}
	
	void printArea() {
		System.out.println("The area of triangle is :" + 0.5*i*j);
	}
}

class Circle extends Shape{
	Circle(int i){
		super(i,i);
	}
	
	void printArea() {
		System.out.println("The area of triangle is :" + 3.142*i*i);
	}
}


public class Abstractt {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10);
		Triangle t = new Triangle(10,10);
		Circle c= new Circle(10);
		r.printArea();
		t.printArea();
		c.printArea();
	}

}
