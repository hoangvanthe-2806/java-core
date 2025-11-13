package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------------------------------");
		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 5);
	}
}
