package java_3;

public class Main {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int osszeg=a+b;
		int kulonbseg=a-b;
		int szorzat=a*b;
		double hanyados=a/b;
		
		System.out.println(osszeg);
		System.out.println(kulonbseg);
		System.out.println(szorzat);
		System.out.println(hanyados);

	}
}
