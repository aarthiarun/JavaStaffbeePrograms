
public class ConstructorExample {
	String name;
	int id;
	int experience;

	public ConstructorExample(String string, int i, int j) {

		name = string;
		id = i;
		experience = j;
	}

	void getValue() {
		System.out.println(name + "    " + id + "    " + experience);
	}

	public static void main(String[] args) {

		ConstructorExample emp1 = new ConstructorExample("tom", 111, 2);
		ConstructorExample emp2 = new ConstructorExample("lolly", 111, 2);
		emp1.getValue();
		emp2.getValue();
	}

}
