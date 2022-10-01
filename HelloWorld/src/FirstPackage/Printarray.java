package FirstPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Printarray {
	public static void main(String[] args) {
		int[] numarray = { 2, 4, 6, 5, 7 };
		int[][] twodime = { { 2, 3 }, { 6, 4, 7 } };
		for (int num : numarray) {
			System.out.println(num);
		}
		// standard library
		System.out.println(Arrays.toString(numarray));
		System.out.println(Arrays.deepToString(twodime));

		int[] array = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("enter the array element");
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}

		System.out.println(Arrays.toString(array));
		input.close();
	}
}
