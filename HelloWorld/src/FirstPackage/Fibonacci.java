package FirstPackage;

public class Fibonacci {
	public static void main(String[] args) {
		int temp=0;
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=1;i<=4;i++) {
			
			temp=first+second;
			System.out.println(temp);
			first=second;
			second=temp;
			
			}
		
	}
}
