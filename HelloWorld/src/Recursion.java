
public class Recursion {
	public static int sum(int j,int k){
		if(k>=j) {
			return k+sum(j,k-1);
		}else {
			return 0;
		}}
	
	public static void main(String[] args) {
		int result=sum(5,10);
		System.out.println(result);
		
	}
}
