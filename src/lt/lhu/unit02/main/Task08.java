package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double x;
		double y;
		a = 2.1;
		b = 3.7;
		h = 0.1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for (x = a; x <=b; x = x + h) {
			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
