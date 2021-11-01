package first_training;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Hello World");
		addNum();
		System.out.println(num());
		System.out.println(add(10,20));
		System.out.println(30+add(20,30));
	}

	public static void addNum() {
		int c=10;
		int d=5;
		System.out.println(c+d);
	}
	
	public static int num() {
		int a=10;
		System.out.println(a);
		return a;
	}
	public static int add(int a,int b){
		int c=a+b;
		return c;
		
	}

}
