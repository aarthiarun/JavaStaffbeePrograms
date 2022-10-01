package FirstPackage;

public class Sumofnatural {
	public static void main(String[] args) {
		int sum = 0, n = 100, i = 1;
		//using while loop
//		while (i <= n) {
//			sum = sum + i;
//			i++;
//		}
		//using for loop
		
		for (i=1;i<=n;i++){
			sum = sum + i;
			i++;
		}

		System.out.println("sum is" + sum);
	}
}
