package java_1;

public class Main {

	public static void main(String[] args) {
		
		int i = 10;
		double j=2.5;
		char a = 'a';
		char A = 65;
		String szoveg = "valami";
		boolean igaze = true;
		
		final double PI=3.14;
		String szo= igaze ? "igaz" : "hamis";
		
		if(igaze)
		{
			System.out.println("igaz");
		}
		else
		{
			System.out.println("hamis");
		}

		System.out.println(i + " " + j + " " + a + " " + A + " " + szoveg + " " + igaze);
		System.out.println(PI);
		System.out.println(!igaze);
	}

}
