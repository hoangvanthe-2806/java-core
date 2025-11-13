package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh cua 1 khoi lap phuong:");
		int canh = scanner.nextInt();
		System.out.println("the tich = " + Math.pow(canh, 3));// the tich = canh x canh x canh = canh ^3 =
																// Math.pow(canh,3)
		scanner.close();
	}
}
