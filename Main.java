
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Solve ax^2+bx+c=0.
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		double x1,x2;
		System.out.print("Enter a: ");
		a=scan.nextInt();
		System.out.print("Enter b: ");
		b=scan.nextInt();
		System.out.print("Enter c: ");
		c=scan.nextInt();
		System.out.println();
		System.out.println("Your equation is: "
		+a+"x^2+"+b+"x+"+c+"=0");
		System.out.println();
		double delta;
		delta=Math.pow(b, 2)-4*a*c;
		if(delta>0) {
			delta=Math.sqrt(delta);
			System.out.println("Delta is: "+delta);
			x1=(-b+delta)/2*a;
			x2=(-b-delta)/2*a;
			System.out.print("X1:"+x1+" and X2:"+x2);
		}
		if(delta==0) {
			x1=-b/2*a;
			System.out.println("X1=X2="+x1);
		}
		if(delta<0) {
			System.out.println("Void");
		}
	}

}
