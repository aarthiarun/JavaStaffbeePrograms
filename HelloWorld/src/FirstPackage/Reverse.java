package FirstPackage;

public class Reverse {
	public static void main(String[] args) {
int n=1234;
int rev=0;
int r;

while(n!=0) {
	
	r=n%10;
	rev=rev*10+r;
    n/=10;
   
}
System.out.println("the reverse of the number is"+rev);

}}
