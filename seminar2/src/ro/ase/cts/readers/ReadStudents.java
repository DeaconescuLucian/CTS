package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;

public class ReadStudents extends AplicantReader {

	public ReadStudents(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException  {
		Scanner input = new Scanner(new File(super.getFilename()));
		input.useDelimiter(",|\n");
		List<Aplicant> aplicanti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student s=new Student();
			super.citesteAplicant(input, s);
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			s.setAn_studii(an_studii);
			s.setFacultate(facultate);
			aplicanti.add(s);
		}
		input.close();
		return aplicanti;
	}
	
}

