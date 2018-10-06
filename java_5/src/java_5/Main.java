package java_5;

public class Main {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		double eredmeny1= (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c)))) / (2*a);
		double eredmeny2= (-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c)))) / (2*a);
		
		System.out.println("X1= "+ eredmeny1);
		System.out.println("X2= "+eredmeny2);
	}

}
