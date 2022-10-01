import java.util.*;

public class MethodExample {
	static String color1;
	
	//no argument no return type
	public void shape() {
		System.out.println("Name of shape is Square");
	}
// with argument and no return type
	public void areaofSquare(int a) {
		System.out.println("Area of square is"+ (a*a));
	}
	// no argument and with return type
	public int sidesofSquare() {
		int sidesofsquare=4;
		return sidesofsquare;
	}
	//with argument and with return type
	public String colorinSquare(String colour) {
		
		return colour;
		
	}
	
	//with argument and with return type
	public String[] colorofSquare(String colors1,String colors2) {
		
		String[]colors=new String[4];
		
		colors[0]=colors1;
		colors[1]=colors2;
		
		return colors;
		}
public String[] colorSquare() {
		
		String[]color1=new String[2];
		
		color1[0]="yellowish";
		color1[1]="blackish";
//		for(String x:color1) {
//			System.out.println(x);
//			
//			}
		return color1;
		}
	
	public int add(int a,int b) {
		int f=a*b;
		return f;
	}
	
public static void main(String[] args) {
	
		MethodExample methodexample=new MethodExample();
		methodexample.colorSquare();
		methodexample.shape();
		methodexample.areaofSquare(5);
		
		System.out.println("The no. of sides in square is" + methodexample.sidesofSquare());
		
		System.out.println("The colors in the square is"+ methodexample.colorinSquare("yellow"));
		
		String c=methodexample.colorinSquare("yellow");
		
		System.out.println("The colors in the square is"+ c);
		
		System.out.println("The colors in the square are"+ Arrays.toString(methodexample.colorofSquare("Yellow","black")));
		
//		System.out.println("The colors in the square are"+ Arrays.toString(methodexample.colorofSquare("Yellow","black")));
		for (String value : methodexample.colorSquare()) {
			System.out.println("value " + value);
		}
		System.out.println(methodexample.add(5,5));
		int f=methodexample.add(5,5);
		System.out.println(f);

	}

}
