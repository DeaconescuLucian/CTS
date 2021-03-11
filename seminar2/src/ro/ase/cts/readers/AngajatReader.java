package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

public class AngajatReader extends AplicantReader {
	
	
	
	public AngajatReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat elev=new Angajat();
			super.citesteAplicant(input2, elev);
			int salariu = input2.nextInt();
			String ocupatie = input2.next();
			Angajat a = new Angajat(elev.getNume(), elev.getPrenume(), elev.getVarsta(), elev.getPunctaj(), elev.getNr_proiecte(), elev.getProiecte(), salariu, ocupatie);
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}

}
