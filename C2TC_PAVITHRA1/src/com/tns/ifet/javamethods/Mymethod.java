package com.tns.ifet.javamethods;

public class Mymethod {
	int a;//instance or global variable
	int b;
	Mymethod(int num1,int num2){//constructor
		a=num1;//local variable
		b=num2;
	}
	/*public void add() {//declare a method//rule 1
		int a=19;
		int b= 20; //block of code
		int sum = a+b;
		System.out.println("Addition value :"+sum);
	}*/
	public int add(int a,int b) {//declare a method
		//int a=19;//rule 2
		//int b= 20; //block of code
		int sum = a+b;
		System.out.println("my method Addition value :"+sum);
		return sum;
	}
	public int sub() {
		int sum=a-b;
		System.out.println("my method subtraction value :"+sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymethod m1=new Mymethod(50,30);
		int resultadd = m1.add(70,30);//calling a method and if we using void method cannot return or store the value in variable(result) 
		int resultsub=m1.sub();
		//m1.add(/*12, 12*/);
		System.out.println("Main method addition value : "+resultadd);
		System.out.println("Main method addition value : "+resultsub);

	}

}
/*java methods : a block of code that perform a specific task
two types :
use defined methods - we can create our own method based on our requirements
standard library methods - built in methods

how to :
declaring a java method
calling a method in java
rules :
1.method without parameter and without a return type
2.method without parameter and with a return type
3.method with parameter and with a return type
 */