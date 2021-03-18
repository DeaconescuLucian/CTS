package ro.ase.cts.eager;

import ro.ase.cts.eager.ClinicaVeterinara;

public class ClinicaVeterinara {
	
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	public static final ClinicaVeterinara instance=new ClinicaVeterinara("Clinica","Bucuresti", 5, 10000);
	
	private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	public static ClinicaVeterinara getInstance()
	{
		return instance;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici + ", buget="
				+ buget + "]";
	}
	
	
}
