package java;
import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter u:");
		double u = input.nextDouble();
		System.out.println("enter a:");
		double a = input.nextDouble();
		System.out.println("enter t:");
		double t= input.nextDouble();
		double s= u*t+0.5*a* Math.pow(t, 2);
		System.out.println("Therefore S is:"+s);
		

	}

}
