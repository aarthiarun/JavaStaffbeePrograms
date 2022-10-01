/*Average of three numbers in array
public class ExampleArray {
	public static void main(String[] args) {
		int []numbers= {2,4,8,7} ;
		int sum=0;
		for(int number:numbers) {
			sum+=number;
			}
		int average=sum/numbers.length;
		System.out.format("The average is:"+ average);
	}
}*/

/*public class ExampleArray{
	public static void main(String[] args) {
		int []numbers= {2,4,8,7} ;
		for(int number:numbers) {
			if(numbers[0]<number)
				numbers[0]=number;	
			}
		System.out.format("The largest number is:"+ numbers[0]);
	}
}*/

public class ExampleArray{
	public static void main(String[] args) {
		int[][]a= {{2,3,6},{9,5,6}};
		int[][]b= {{2,3,6},{9,5,6}};
		int[][]c=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
			}
		
	}}

