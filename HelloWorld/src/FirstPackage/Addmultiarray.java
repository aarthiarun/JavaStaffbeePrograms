package FirstPackage;


public class Addmultiarray {
	public static void main(String[] args) {
		int[][]array2= {{2,4,8},{6,5,7}};
		int[][]array3= {{2,6,9},{6,7,9}};
		int[][] sum = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				sum[i][j]=array2[i][j]+array3[i][j];
			}
		}
		//System.out.println(Arrays.deepToString(sum));
		System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}
}
