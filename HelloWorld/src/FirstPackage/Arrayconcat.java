package FirstPackage;

import java.util.Arrays;

public class Arrayconcat {
	public static void main(String[] args) {
	int[] numarr1 = { 2, 4, 6, 5, 7 };
	int[] numarr2 = { 2, 4, 6, 7, 7 };
	int len1=numarr1.length;
	int len2=numarr2.length;
	int[]result=new int[len1+len2];
	System.arraycopy(numarr1,0,result,0,len1);
	System.arraycopy(numarr2,0,result,len1,len2);
	System.out.println(Arrays.toString(result));
}}
