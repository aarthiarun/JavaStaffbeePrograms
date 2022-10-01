package oopsconcept;

class B extends A
{
   public void methodB()
   {
     System.out.println("Child class methodB");
   }
   public void methodA()
   {
	   super.methodA();
     System.out.println("child  class methodA from class A");
   }}