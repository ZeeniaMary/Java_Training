package first_training;

public class PracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(sub());
		System.out.println(30+div());
		System.out.println(mul());
	}

	public static int add() {
		int a = 50;
		int b = 50;
		int c = a + b;
		return c;
	}

	public static double sub() {
		double x = 10.567;
		double y = 7.889;
		double z = x - y;
		return z;
	}

	public static double mul() {
		double u = 285.8790;
		double v = 984.5567;
		double w = u * v;
		return w;
	}
	
	public static int div() {
		int i = 700;
		int j = 10;
		int k = i/j;
		return k;
	}
}
