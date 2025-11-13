package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a:");
		int a = scanner.nextInt();
		System.out.println("Nhap so b:");
		int b = scanner.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		scanner.close();
		System.out.println("Max: " + max + ", Min: " + min);

	}
}
