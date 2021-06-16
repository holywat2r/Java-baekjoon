package b2588;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f,mul,mul1,mul2,mul3;
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = b % 10; //1의 자리 
		d = b / 10;
		
		e = d % 10; //10의 자리 
		f = d / 10; //100의 자리 
		
		mul1 = a * c;
		mul2 = a * e;
		mul3 = a * f;
		mul = mul1 + (mul2 * 10) + (mul3* 100);
		System.out.println(mul1);
		System.out.println(mul2);
		System.out.println(mul3);
		System.out.println(mul);
	}

}
