package ro.ase.cts.main;

import ro.ase.cts.classes.IRezervare;
import ro.ase.cts.classes.ProxyRezervare;
import ro.ase.cts.classes.Rezervare;

public class program1 {

	public static void main(String[] args) {
		
		IRezervare rezervare1=new Rezervare(3,2);
		rezervare1.anuntaRezervare();
		
		IRezervare rezervare2=new ProxyRezervare(rezervare1);
		rezervare2.anuntaRezervare();
		
		
	}

}
