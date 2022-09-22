package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double a = 23.2;
		double b = -12.0;
		double c = 11.0;
		double a1,b1,c1;
		if (a < 0) {
			a1 = Math.pow(a, 4);
		} else {
			a1 = Math.pow(a, 2);
		}
		if (b < 0) {
			b1 = Math.pow(b, 4);
		} else {
			b1 = Math.pow(b, 2);
		}
		if (c < 0) {
			c1 = Math.pow(c, 4);
		} else {
			c1 = Math.pow(c, 2);
		}
		System.out.println("a1 = " + a1 + "\nb1 = " + b1 + "\nc1 = " + c1);
		
	}

}
