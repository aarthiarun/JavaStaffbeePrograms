import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = input.nextInt();
		int b = input.nextInt();
	System.out.println("Enter the operation");
		String operation=input.next();
		
		switch(operation) {
		case "add":
			int resultadd=a+b;
			System.out.println(resultadd);
			break;
		case "sub":
			int resultsub=a-b;
			System.out.println(resultsub);
			break;
		}
		input.close();

}
}