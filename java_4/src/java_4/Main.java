package java_4;

public class Main {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		
		
		double sztk=a+b+c+d+e/5;
		
		System.out.println("A számok mértani közepe: "+ sztk);
	}
}
