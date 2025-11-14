package helloworld;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Run bai 03 lab 03");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập vào số lượng phần tử của mảng:");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		// sort
		System.out.println("Array ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array sắp xếp: " + Arrays.toString(a));
		System.out.println("max = " + a[a.length - 1]);
		System.out.println("min = " + a[0]);
		System.out.println("------------------------------------------");
		// vong lap
		int max = 0;
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] > a[k]) {
					int temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}
		System.out.print("Mảng sau khi sắp xếp: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		max = a[a.length - 1];
		min = a[0];
		System.out.println("\nMax : " + max + " Min : " + min);
	}
}
