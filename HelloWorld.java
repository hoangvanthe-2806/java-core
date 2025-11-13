package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean tiepTuc = true;

		while (tiepTuc) {
			System.out.println("\n>> LỰA CHỌN TÍNH NĂNG <<");
			System.out.println("++------------------++");
			System.out.println("| 1. CỘNG           |");
			System.out.println("| 2. TRỪ            |");
			System.out.println("| 3. KẾT THÚC       |");
			System.out.println("++------------------++");

			System.out.print("LỰA CHỌN CỦA BẠN LÀ: ");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println(">> Phép tính CỘNG <<");
				System.out.print("Nhập số a: ");
				int a1 = scanner.nextInt();
				System.out.print("Nhập số b: ");
				int b1 = scanner.nextInt();
				System.out.println("Tổng 2 số a và b = " + (a1 + b1));
				break;

			case 2:
				System.out.println(">> Phép tính TRỪ <<");
				System.out.print("Nhập số a: ");
				int a2 = scanner.nextInt();
				System.out.print("Nhập số b: ");
				int b2 = scanner.nextInt();
				System.out.println("Hiệu 2 số a và b = " + (a2 - b2));
				break;

			case 3:
				System.out.println(">> KẾT THÚC CHƯƠNG TRÌNH <<");
				tiepTuc = false; // Thoát khỏi vòng lặp
				continue; // bỏ qua câu hỏi "làm tiếp?" phía dưới

			default:
				System.out.println(">> CHỨC NĂNG KHÔNG TỒN TẠI <<");
			}

			System.out.print("Bạn có muốn làm tiếp không? (c/k): ");
			char chon = scanner.next().charAt(0);
			if (chon == 'k' || chon == 'K') {
				tiepTuc = false;
				System.out.println(">> CẢM ƠN BẠN, CHƯƠNG TRÌNH KẾT THÚC <<");
			}
		}

		scanner.close();
	}
}
