package ro.ase.cts.main;

import ro.ase.cts.classes2.FabricaRezervari;
import ro.ase.cts.classes2.Rezervare;

public class program2 {

	public static void main(String[] args) {
		
		Rezervare rezervare1=new Rezervare(1,3,"ora sau ceva");
		Rezervare rezervare2=new Rezervare(2,4,"ora sau ceva");
		Rezervare rezervare3=new Rezervare(5,1,"ora sau ceva");
		
		FabricaRezervari fabrica=new FabricaRezervari();
		fabrica.getClient("Cineva@gmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("Cineva@gmail.com").afisareInformatii(rezervare3);
	}

}
