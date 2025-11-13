package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void giaiPhuongTrinhBacNhat(int b, int c) {
		if (b == 0) {
			if (c == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			float x = -((float) c / b);
			System.out.println("Phương trình bậc nhất, có nghiệm x = " + x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số a:");
		int a = scanner.nextInt();
		System.out.println("Nhập số b:");
		int b = scanner.nextInt();
		System.out.println("Nhập số c:");
		int c = scanner.nextInt();

		System.out.printf("Giải Phương trình bậc 2: %dx^2 + %dx + c = 0 \n", a, b, c);
		if (a == 0) {
			// a = 0 thi phuong trinh tro thanh bac 1: bx + c = 0
			System.out.printf("Giải Phương trình bậc nhất: %dx + %d = 0 \n", b, c);
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = (int) Math.pow(b, 2) - 4 * (a * c);
			System.out.println("Delta = " + delta);
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép: x = -b/(2.a) " + (-b / (2 * a)));
			} else {
				System.out.println("Phương trình có 2 nghiệm riêng biệt:");
				System.out.println("X1 = (-b + căn(delta))/(2*a)= " + ((float) (-b + Math.sqrt(delta)) / (2 * a)));
				System.out.println("X2 = (-b - căn(delta))/(2*a)= " + ((float) (-b - Math.sqrt(delta)) / (2 * a)));
			}
		}
	}
}
