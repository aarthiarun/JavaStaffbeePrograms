
public class Bicycle {

	// field of class
	int gear = 5;

	// method of class
	void braking() {
		System.out.println("i m barking method");
	}

	public static void main(String[] args) {
			  

			  
		// create object
		Bicycle sportsBicycle = new Bicycle();

		// access field and method
		System.out.println(sportsBicycle.gear);
		sportsBicycle.braking();
}
}