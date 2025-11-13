package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien: ");
		String name = scanner.nextLine();
		System.out.println("DTB:");
		int dtb = scanner.nextInt();
		System.out.println(name + " co diem = " + dtb);

	}
}
