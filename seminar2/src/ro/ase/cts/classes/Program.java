package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ReadStudents;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti();
		
		
		
	}


	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti =citesteAplicanti(new ReadStudents("studenti.txt"));
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(new Proiect(80));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(Angajat.getSmaFinantare());
		System.out.print(Student.getSmaFinantare());
	}

}
