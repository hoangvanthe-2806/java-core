package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("lab 02 bai tap 3");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số điện:");
		int a = scanner.nextInt();
		if (a < 100) {
			int money = a * 1000;
			System.out.println("Số tiền điện = " + money);
		} else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("Số tiền điện = " + money);
		}
	}
}
