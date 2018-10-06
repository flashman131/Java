package java_7;

public class Main {
	public static void main(String[] args)
	{
		int szam=Integer.parseInt(args[0]);
		
		boolean ottel,harommal, kettovel;
		
		if(szam%5==0)
		{
			ottel=true;
		}
		else
			ottel=false;
		if(szam%3==0)
		{
			harommal=true;
		}
		else
			harommal=false;
		if(szam%2==0)
		{
			kettovel=true;
		}
		else
		{
			kettovel=false;
		}
		System.out.println("A szám öttlet ostható-e?: "+ ottel);
		System.out.println(" A szám hárommal osztható-e?: " + harommal);
		System.out.println(" A szám kettõvel osztható-e?: "+ kettovel);
		
	}

}
