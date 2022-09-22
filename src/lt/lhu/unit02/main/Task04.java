package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int sum;
		System.out.println("Введите число a");
		a = sc.nextInt();
		System.out.println("Введите число b");
		b = sc.nextInt();
		System.out.println("Введите число c");
		c = sc.nextInt();
		System.out.println("Введите число d");
		d = sc.nextInt();
		sum = a + b + c + d;
		System.out.println("sum = " + sum);
		
	}

}
