package java_10;

public class Main {
	public static void main(String[] args)
	{
		if(args.length<2)
		{
			System.out.println("Kett� sz�m megad�sa k�telez�!");
		}
		else
		{
			int sz1=Integer.parseInt(args[0]);
			int sz2=Integer.parseInt(args[1]);
			
			if(sz1<sz2)
			{
				System.out.println("A m�sodik sz�m a nagyobb!");
			}
			else
			{
				System.out.println("Az els� sz�m a nagyobb!");
			}
		}
	}
	
}
