package FirstPackage;

public class Averagearray {
	public static void main(String[] args) {
		int[]number= {2,4,6,5};
		int sum=0;
		float avg=0;
		for(int i=0;i<=3;i++) {
			sum=sum+number[i];
			
	}
		avg=sum/number.length;
		System.out.format("the average is %.2f",avg);
		}
}
