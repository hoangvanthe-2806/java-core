package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai: ");
		int cd = scanner.nextInt();
		System.out.println("chieu rong:");
		int cr = scanner.nextInt();
		System.out.println("Chu vi hcn = " + ((cd + cr) * 2)); // (chieu dai+ chieu rong)*2
		System.out.println("Dien  tich hcn = " + (cd * cr)); // chieu dai x chieu rong
		System.out.println("Canh nho nhat: " + Math.min(cd, cr));

	}
}
