package com.tns.ifet.oopsclsobjencaps;
class mobile{ //encapsulation no.of.variables and no.of methods in single unit(mobile class) is called encapsulation
	String mobilename;//variables
	String mobilemodel = "note8";
	void appinstalled() {
		System.out.println("App is installed");
		System.out.println("Mobile phone : "+mobilename);
	}
	void settings() { //methods
		System.out.println("Settings enabled");
	}
}
public class MobileAppStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Function");
		mobile m1 = new mobile();//object is created for access class(define variables and methods so on...)
		m1.mobilename = "Vivo";
		m1.settings();
		m1.appinstalled();
		//m1.mobilename = "Vivo"; here cannot executed
		//m1 reference variable
		//new memory allocation
		//new mobile() calling constructor

	}

}
