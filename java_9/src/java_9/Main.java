package java_9;

public class Main {
	public static void main (String[] args)
	{
		int min=1;
		int max=1000000;
		int szam=Integer.parseInt(args[0]);
		if(szam<min || szam>max)
		{
			System.out.println("A szám túlmutat az intervallumon");
		}
		else
		{			
			int szamjegy=(int)(Math.log10(szam)+1);			
			System.out.println("Számjegyek száma: "+szamjegy);
		}
		
	}

}
