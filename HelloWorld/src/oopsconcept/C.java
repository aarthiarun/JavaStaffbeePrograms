package oopsconcept;

public class C extends B {
	public void methodC()
	   {
	     System.out.println("Child class methodC");
	   }
	public void methodA()
	   {
		super.methodA();
	     System.out.println("Child class methodA from class A");
	   }
	public void methodB()
	   {
		super.methodB();
	     System.out.println("Child class methodB from class B");
	   }
	

}
