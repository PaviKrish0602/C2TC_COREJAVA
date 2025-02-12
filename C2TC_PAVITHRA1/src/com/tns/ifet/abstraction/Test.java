package com.tns.ifet.abstraction;

public abstract class Test {
	abstract void eat();
}
class test2 extends Test{
void eat() {
	System.out.println("helloooo");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	test2 tt=new test2();
	tt.eat();
	}
}

/*hiding implementation details only showing relevant information to user
abstraction can be achieved by two ways
 1.abstract class(0-100%)
 2.Interface(100%)
abstract class::
   without body(no implementation)
   abstract method only declared within abstract class
   concrete method also possible
whenever the abstract class inherit by another class which class should implement the abstract method   
   */
