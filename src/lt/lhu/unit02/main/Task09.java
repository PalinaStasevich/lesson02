package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		double x;
		double fx;
		x = 3.5;
		if (x > 3) {
			fx = 1 / (x * x + 1);
		} else {
			fx = 9;
		}
		System.out.println("F(x) = " + fx);

	}

}
