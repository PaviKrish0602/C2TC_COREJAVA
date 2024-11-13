package com.tns.ifet.interfaces;
interface AI{
	void onML();
}
interface Controllable{
	void onLeft();
	void onRight();
	void onAbove();
	void onBelow();
}
interface myCustomAI{
	void onLeft();
	void roborover();
}

class Robot implements Controllable,AI,myCustomAI{

	@Override
	public void onLeft() {
		// TODO Auto-generated method stub
		System.out.println("Robot Turns Left");
		
	}

	@Override
	public void onRight() {
		// TODO Auto-generated method stub
		System.out.println("Robot Turns Right");
		
	}

	@Override
	public void onAbove() {
		// TODO Auto-generated method stub
		System.out.println("Robot Turns Forward");
		
	}

	@Override
	public void onBelow() {
		// TODO Auto-generated method stub
		System.out.println("Robot Turns Backward");
		
	}

	@Override
	public void onML() {
		// TODO Auto-generated method stub
        System.out.println("Machine Learning");
		
	}

	@Override
	public void roborover() {
		// TODO Auto-generated method stub
		System.out.println("Robot Rover");
		
	}

	}
		
class AIRobot extends Robot{
	void summa() {
		System.out.println("summa thaan");
	}
}
public class AI_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Robot r1=new Robot();
		r1.onLeft();
		r1.onML();*/
		AIRobot a1=new AIRobot();
		a1.onML();
		a1.onLeft();

}
}
