package zadaca4;


public class Brojach {
	public int glava;
	public int pismo;
	public int brojac;
	
	public Brojach ()
	{
		this.glava=0;
		this.pismo=0;
		this.brojac=1;
	}
	
	public void frlanje(int frlanja)
	{
	while(brojac <= frlanja)
			 {
				 double randNum = Math.random();
				 
				 if (randNum <= 0.5)
				 {
					 glava++;
				 }
				 else
				 {
					 pismo++;
				 }
				 brojac++;
			 }
	}
	
	
	public void resetBrojac()
	{
		this.brojac =1;
		this.glava =0;
		this.pismo =0;
	}
	

}
