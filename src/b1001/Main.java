package b1001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2,diff;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		diff = num1 - num2;
		System.out.println(diff);
	}
}