package FirstPackage;

public class LargestElementArray {
	public static void main(String[] args) {
		int[]numarray= {2,4,6,5,7};
		
		int temp=numarray[0];
		for(int num:numarray) {
			if(num>temp) {
				temp=num;
			}}
		System.out.println(temp);
		
		
}}
