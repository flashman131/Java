package java_2;

public class Main{
	public static void main (String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		double A= 2*((a*b)+(a*c)+(b*c));
		double V=a*b*c;
		
		System.out.println("A felszín: "+A);
		System.out.println("A térfogat: " +V);
	}
}
