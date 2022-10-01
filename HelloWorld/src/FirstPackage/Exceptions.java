package FirstPackage;

public class Exceptions {
	public static void main(String[] args) {
		
		try
		{
		int	c=5/0;
		
		System.out.println(c);
		}catch( ArrayIndexOutOfBoundsException e){

			e.printStackTrace();

		}catch( ArithmeticException e){

			e.printStackTrace();

		}finally {
			System.out.println("i m from finally block ");
		}
		
		
	}
}
