//constructor overloading

class Example2 {
	public static void main(String[] args) {

		// call constructor with no parameter
		ConsOverloading obj1 = new ConsOverloading();

		// call constructor with a single parameter
		ConsOverloading obj2 = new ConsOverloading("Python");

		obj1.getName();
		obj2.getName();
	}
}