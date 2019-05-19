import java.util.Scanner;

public class Main {
	
	private static Scanner x = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		
		x(x.nextInt());

		x.close();
	}
	
	public static void x(int x) {
		System.out.println(x*1);
		System.out.println(x*2);
		System.out.println(x*3);
		System.out.println(x*4);
		System.out.println(x*5);
		System.out.println(x*7);
		System.out.println(x*8);
		System.out.println(x*9);
		System.out.println(x*10);
		System.out.println(x*11);
		System.out.println(x*12);
	}
}
