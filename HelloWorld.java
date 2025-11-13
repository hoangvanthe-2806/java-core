package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void Bai01() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuơng trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Nghiệm phương trình = %.3f ", x);
		}
	}

	public static void Bai02() {
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

	public static void Bai03() {
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean tuychon = true;
		while (tuychon) {
			System.out.println("\n>> LỰA CHỌN TÍNH NĂNG <<");
			System.out.println("++------------------------------------++");
			System.out.println("|  1. GIẢI PHƯƠNG TRÌNH BẬC NHẤT     |");
			System.out.println("|  2. GIẢI PHƯƠNG TRÌNH BẬC HAI      |");
			System.out.println("|  3. TÍNH SỐ TIỀN ĐIỆN              |");
			System.out.println("|  4. KẾT THÚC                       |");
			System.out.println("++------------------------------------++");

			System.out.print("LỰA CHỌN CỦA BẠN LÀ: ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println(">>Giải phương trình bậc nhất<<");
				Bai01();
				break;
			case 2:
				System.out.println(">>Giải phương trình bậc hai<<");
				Bai02();
				break;
			case 3:
				System.out.println(">>Tính tiền điện<<");
				Bai03();
				break;
			default:
				System.out.println("Không có tính năng này");
				break;
			}

			System.out.println("Bạn có muốn làm tiếp không? (y/n)");
			char chon = scanner.next().charAt(0);
			if (chon == 'n' || chon == 'N') {
				tuychon = false;
			}

		}
		scanner.close();
	}
}
