package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 số nguyên bất kỳ:");
		int x = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d \n", x, i, x * i);
		}
		scanner.close();
	}
}
