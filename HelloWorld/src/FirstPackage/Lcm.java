package FirstPackage;

public class Lcm {
	public static void main(String[] args) {
		int n1=25,n2=5,i;
		int gcd = 0;
		for( i=1;i <= n1 && i <= n2;i++) {
			if(n1%i==0 && n2%i==0) 
				gcd=i;
			
			}
		System.out.println("gcd is"+ i); 
		int lcm=(n1*n2)/gcd;
		System.out.println("lcm is"+ lcm);
		
	}
}
