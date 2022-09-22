package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		double x;
		System.out.println("Введите число a");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		x = a * a - Math.pow(b - c, 2) + Math.log(b * b + 1);
		System.out.println("x = " + x);

	}

}
