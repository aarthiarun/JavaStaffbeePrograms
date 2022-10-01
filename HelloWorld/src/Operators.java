import java.util.Scanner;
// checking else if condition by getting input from the user.
public class Operators {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 3 integer numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
	// using logical operator
		if(a>b && a>c) {
		System.out.println("A is bigger");
		}
	else if (b>c && b>c){
		System.out.println("B is bigger");
	}
	else {
		System.out.println("c is bigger");
		}
input.close();
	}}
