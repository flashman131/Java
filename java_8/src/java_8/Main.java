package java_8;

public class Main {
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		boolean szerkesztheto;
		
		if(a<b+c && b<a+c && c<a+b)
		{
			szerkesztheto=true;
		}
		else
			szerkesztheto=false;
		
		if(szerkesztheto==true)
		{
			System.out.println("A háromszög megszerkeszthetõ!");
		}
		else
			System.out.println("A háromszög NEM megszerkeszthetõ!");
		
	}

}
