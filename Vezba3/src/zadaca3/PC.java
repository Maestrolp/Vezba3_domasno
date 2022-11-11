package zadaca3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String golemina = "GB";
	
	
	public PC ()
	{
		this.memorija = 2;
		this.tipNaMemorija = "DD2";
		this.hardDisk = 160;
	}
	
	public void zgolemiMem(int zgolemiMemorija, int novHardDisk)
	{
		int zgolemenaMemorija = this.memorija + zgolemiMemorija;
		int zgolemenProstor = this.hardDisk + novHardDisk;
		System.out.println("Memorijata bese " +this.memorija +" " +golemina +", sega iznesuva " +zgolemenaMemorija +" " +golemina +".");
		System.out.println("Tipot na memorija e " +tipNaMemorija +".");
		System.out.println("HD ima golemina od " +this.hardDisk +" " +golemina +". Prethodno iznesuvase " +zgolemenProstor + " " +golemina +".");
	}

}
