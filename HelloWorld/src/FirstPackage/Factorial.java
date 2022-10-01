package FirstPackage;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {  
	       int x;
	       int fact=1;   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the number");  
	       x = sc.nextInt();  
	       if(x==0) {
	    	   System.out.println("the factorial of 0 is 1");  
	    	   }
	       else {
	    	   for (int i=1;i<=x;i++) {
	    		  fact=fact*=i;
	    	   }
	    	   System.out.println("the factorial of "+x+"  is  "+fact);
	       }
	       sc.close();
	       }
}
