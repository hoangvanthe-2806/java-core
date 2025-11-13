package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap diem toan:");
		int toan = scanner.nextInt();
		System.out.println("nhap diem van: ");
		int van = scanner.nextInt();
		System.out.println("nhap diem tieng anh:");
		int tiengAnh = scanner.nextInt();
		scanner.close();
		int dtb = (toan + van + tiengAnh) / 3;
		if (dtb > 5) {
			System.out.println("Qua môn học");
		} else if (dtb < 5) {
			System.out.println("Rớt môn học");
		} else {
			System.out.println("bạn bỏ thi, rót môn học");
		}
	}
}
