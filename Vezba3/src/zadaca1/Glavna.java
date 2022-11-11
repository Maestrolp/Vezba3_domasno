package zadaca1;

public class Glavna {
	public static void main(String[] args)
	{
		Avtomobil av = new Avtomobil ("Hyndai", "Accent", "Red", 150569, 2000, "VE-838-RD");
		
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}

}
