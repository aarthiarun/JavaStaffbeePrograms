import java.util.Scanner;

/*Write a Java program that reads a floating-point number and 
prints "zero" if the number is zero. 
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, 
or "large" if it exceeds 1,000,000.*/ 

public class Conditions {
public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
	
		float num = input.nextFloat();
		if(num==0) {
			System.out.println("The number is zero");
		}
		else if(num>0 ) {
			if(num>1000000)
				System.out.println("The number is positive and large");
			else
				System.out.println("The number is positive and small");
		}
		else if(num<0) {
			
				
			if(Math.abs(num)>1000000)
				System.out.println("The number is negative and large");
			else
				System.out.println("The number is negative and small");
		}
				input.close();
	}}
