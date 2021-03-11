package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

public class ElevReader extends AplicantReader{
	
	public ElevReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Elev elev=new Elev();
			super.citesteAplicant(input2, elev);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			Elev e = new Elev(elev.getNume(), elev.getPrenume(), elev.getVarsta(), elev.getPunctaj(), elev.getNrProiecte(), elev.getProiecte(), clasa, tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}

}
