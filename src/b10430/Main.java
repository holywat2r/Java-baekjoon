package b10430;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c,cal1,cal2,cal3,cal4;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		cal1 = (a+b)%c;
		cal2 = ((a%c)+(b%c))%c;
		cal3 = (a*b)%c;
		cal4 = ((a%c)*(b%c))%c;
		System.out.println(cal1);
		System.out.println(cal2);
		System.out.println(cal3);
		System.out.println(cal4);
		
	}

}
