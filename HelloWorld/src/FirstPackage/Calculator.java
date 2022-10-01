package FirstPackage;

public class Calculator {
//	public int addition(int a , int b){
//	      int result = a+b;
//	      return result;
//	   }
	public double addition(double d , double e,double f){
	      double result = d+e+f;
	      return result;
	   }
	   public int addition(int a , int b, int c){
	      int result = a+b+c;
	      return result;
	   }
	   public static void main(String args[]){
	      Calculator cal = new Calculator();
	      System.out.println(cal.addition(12.5, 13.5, 15.8));
	     // System.out.println(cal.addition(12, 13, 15));
	   }
	}