package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClinicaVeterinara vet1=ClinicaVeterinara.getInstance();
		ClinicaVeterinara vet2=ClinicaVeterinara.getInstance();
		
		System.out.println(vet1.toString());
		System.out.println(vet2.toString());
		
		ClinicaVeterinaraLazy vet3=ClinicaVeterinaraLazy.getInstance("nume","adresa",4,4500);
		ClinicaVeterinaraLazy vet4=ClinicaVeterinaraLazy.getInstance("nume1","adresa1",40,45090);
		
		System.out.println(vet3.toString());
		System.out.println(vet4.toString());
		
		vet3.setNume("Ciucurel");
		vet4.setNume("Betonel");
		
		System.out.println(vet3.toString());
		System.out.println(vet4.toString());
	}

}
