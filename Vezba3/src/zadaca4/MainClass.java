package zadaca4;
import java.util.Scanner;

public class MainClass {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int frlanja = input.nextInt();
		
		Brojach para1 = new Brojach();
		
		para1.frlanje(frlanja);
				 
		System.out.println("glava padnalo " +para1.glava +" pati");
		System.out.println("pismo padnalo " +para1.pismo +" pati");
		System.out.println("Brojacot e resetiran pa da go testirame");
		System.out.println("Vnesete povtorno broj na frlanja");
		
		para1.resetBrojac();
		
		frlanja = input.nextInt();
		para1.frlanje(frlanja);
				
		System.out.println("glava padnalo " +para1.glava +" pati");
		System.out.println("pismo padnalo " +para1.pismo +" pati");
		System.out.println("Brojacot e povtorno resetiran");
		
		para1.resetBrojac();
	}
}
