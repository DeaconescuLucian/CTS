package ro.ase.cts.lazy;

import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class ClinicaVeterinaraLazy {
	
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	public static ClinicaVeterinaraLazy instance=null;
	
	private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget)
	{
		if(instance==null)
			instance=new ClinicaVeterinaraLazy(nume,adresa,numarMedici,buget);
		return instance;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici + ", buget="
				+ buget + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	
	
	
}