package zadaca1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominataKm;
	public int godiniNaProizvodstvo;
	public String registracija;
	
	public Avtomobil (String marka, String model, String boja, double pominataKm, int godiniNaProizvodstvo, String registracija)
	{
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominataKm = pominataKm;
		this.godiniNaProizvodstvo = godiniNaProizvodstvo;
		this.registracija = registracija;

	}
	
	public void prvMetod()
	{
		System.out.println(this.marka +", " +this.model +", " +this.boja);
	}
	
	public double vtorMetod ()
	{
		double pKm;
		pKm = this.pominataKm + 1520.25;
		return pKm;
		
	}

}
