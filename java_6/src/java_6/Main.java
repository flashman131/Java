package java_6;

public class Main {
	public static void main(String[] args)
	{
		int szam= Integer.parseInt(args[0]);
		
		boolean osztoe;
		if(szam%2==0)
		{
			osztoe=true;
			System.out.println("A sz�m p�ros");
		}
		else
		{
			osztoe=false;
			System.out.println("A sz�m p�ratlan");
		}
		
		
	}
	
}
