package FirstPackage;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of c");
		char c = sc.next().charAt(0);
		c=Character.toLowerCase(c);
		switch(c) {
		case 'a':
		case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(c + " is vowel");
            break;
        default:
            System.out.println(c + " is consonant");
		
         sc.close();
            }
		
		
	}
	
}
