package FirstPackage;

public class Frequencyofchar {
	public static void main(String[] args) {
		String str = "i am a be graduate ";

		char ch = 'a';
		int freq = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				++freq;
			}

		}
		System.out.println("the frequency of " + ch + "is" + freq);
	}
}
