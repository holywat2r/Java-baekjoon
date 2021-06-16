package b10869;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,sum,diff,mul,div,rem;
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		diff = a - b;
		mul = a * b;
		div = a / b;
		rem = a % b;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
	}

}
