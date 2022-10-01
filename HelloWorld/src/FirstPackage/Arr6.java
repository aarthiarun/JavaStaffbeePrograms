package FirstPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr6 {
	public static void main(String[] args) {
		ArrayList<Integer> data1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6,7));
		System.out.println(data1);
		ArrayList<Integer> sub = new ArrayList<Integer>(data1.subList(0, 6));
		System.out.println(sub);
		sub.removeIf(num-> num%2==0);
		System.out.println(sub);
		Object [] arr1= sub.toArray();
	System.out.println(Arrays.toString(arr1));
		
	}


}
