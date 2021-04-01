package seminar5.ro.ase.cts.main;

import seminar5.ro.ase.cts.classes.Builder;
import seminar5.ro.ase.cts.classes.Builderv2;
import seminar5.ro.ase.cts.classes.Rezervare;

public class program {

	public static void main(String[] args) {
		
		Rezervare rezervare=new Builder().setCodRezervare(2).setBauturaInclusa(true).build();
		System.out.println(rezervare.toString());
		
		Rezervare rezervare1=new Builder().setCodRezervare(4).setGenMuzica("lautareasca").build();
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2=new Builder(8).setGenMuzica("lautareasca").build();
		System.out.println(rezervare2.toString());
		
		Builderv2 builder=new Builderv2(10).setBauturaInclusa(true);;
		Rezervare rez=builder.setCodRezervare(5).build();
		System.out.println(rez.toString());
		
		Rezervare rez1=builder.setCodRezervare(6).setMuzicaAmbientala(true).build();
		System.out.println(rez1.toString());
	}

}
